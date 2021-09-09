/*
 * Author: Joshua Gray
 * Date: 9/8/21
 * 
 * This program displays a Sierpinski triangle where the user can 
 * increase or decrease the order of the triangle with buttons.
 */
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SierpinskiTriangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create pane
		SierpinskiTrianglePane pane = new SierpinskiTrianglePane();
		
		// Create buttons
		Button btMinus = new Button("-");
		Button btPlus = new Button("+");
		
		// Button listeners
		btMinus.setOnAction(e -> {
			if (pane.order != 0) {
				pane.setOrder((pane.order) - 1);
			}
		});
		
		btPlus.setOnAction(e -> {
			pane.setOrder((pane.order) + 1);
		});
		
		// Pane to hold buttons
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btMinus, btPlus);
		hBox.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		
		// Create scene and place it in stage
		Scene scene = new Scene(borderPane, 200, 210);
		primaryStage.setTitle("Exercise18_19");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.widthProperty().addListener(ov -> pane.paint());
		pane.heightProperty().addListener(ov -> pane.paint());
	}
	
	// Pane for displaying triangles
	static class SierpinskiTrianglePane extends Pane {
		private int order = 0;
		
		// Set a new order
		public void setOrder(int order) {
			this.order = order;
			paint();
		}
		
		protected void paint() {
			// Select three points in proportion to the pane size
			Point2D p1 = new Point2D(getWidth() / 2, 10);
			Point2D p2 = new Point2D(10, getHeight() - 10);
			Point2D p3 = new Point2D(getWidth() - 10, getHeight() - 10);
			
			this.getChildren().clear();
			
			displayTriangles(order, p1, p2, p3);
		}
		
		private void displayTriangles(int order, Point2D p1, Point2D p2, 
				Point2D p3) {
			if (order == 0) {
				// Draw a triangle to connect three points
				Polygon triangle = new Polygon();
				triangle.getPoints().addAll(p1.getX(), p1.getY(), p2.getX(),
					p2.getY(), p3.getX(), p3.getY());
				triangle.setStroke(Color.BURLYWOOD);
				triangle.setFill(Color.YELLOW);
				
				this.getChildren().add(triangle);
			}
			else {
				// Get the midpoint on each edge in the triangle
				Point2D p12 = p1.midpoint(p2);
				Point2D p23 = p2.midpoint(p3);
				Point2D p31 = p3.midpoint(p1);
				
				// Recursively display three triangles
				displayTriangles(order - 1, p1, p12, p31);
				displayTriangles(order - 1, p12, p2, p23);
				displayTriangles(order - 1, p31, p23, p3);
			}
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
