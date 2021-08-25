import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveBall extends Application {
	public static void main(String args[]) {
		launch(args);
	}
	BallPane ballPane = new BallPane();
	@Override
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
		Scene scene = new Scene(ballPane, 450, 300);
		primaryStage.setTitle("MoveBall");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// Create buttons in HBox
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		HBox hBox = new HBox(btLeft, btRight, btUp, btDown);
		hBox.setSpacing(40);
		hBox.setAlignment(Pos.BOTTOM_CENTER);
		ballPane.getChildren().add(hBox);

		BorderPane borderPane = new BorderPane();
		borderPane.setBottom(hBox);
		ballPane.getChildren().add(borderPane);
		
		// Move ball with key press
		ballPane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.LEFT) {
				ballPane.moveBallLeft();
			}
			else if (e.getCode() == KeyCode.RIGHT) {
				ballPane.moveBallRight();
			}
			else if (e.getCode() == KeyCode.UP) {
				ballPane.moveBallUp();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				ballPane.moveBallDown();
			}
		});
		
		// Move ball left with button press
		btLeft.setOnAction(e -> {
			ballPane.moveBallLeft();
		});
		
		// Move ball right with a button press
		btRight.setOnAction(e -> {
			ballPane.moveBallRight();
		});
		
		// Move ball up with a button press
		btUp.setOnAction(e -> {
			ballPane.moveBallUp();
		});
		
		// Move ball down with a button press
		btDown.setOnAction(e -> {
			ballPane.moveBallDown();
		});
		
	}
}

class BallPane extends Pane {
	// Create circle
	public final double radius = 20;
	private double x = radius, y = radius;
	private double dx = 1, dy = 1;
	private Circle circle = new Circle(x, y, radius);
	
	public BallPane() {
		circle.setFill(Color.PURPLE); // Set ball color
		getChildren().add(circle); // Place a ball into pane
	}
	
	protected void moveBallLeft() {
		// Check boundaries
		if (x < radius || x > getWidth() - radius) {
			dx *= -1; // Change direction
		}
		else if (x > radius || x < getWidth() - radius) {
			dx = 1; // Reset direction
		}
		
		// Adjust position
		x -= dx;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
	
	protected void moveBallRight() {
		// Check boundaries
		if (x < radius || x > getWidth() - radius) {
		dx *= -1; // Change direction
		}
		else if (x > radius || x < getWidth() - radius) {
			dx = 1; // Reset direction
		}
		
		// Adjust position
		x += dx;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
	
	protected void moveBallUp() {
		// Check boundaries
		if (y < radius || y > getHeight() - radius) {
			dy *= -1; // Change direction
		}
		else if (y > radius || y < getHeight() - radius) {
			dy = 1; // Reset direction
		}
		
		// Adjust position
		y -= dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
	
	protected void moveBallDown() {
		// Check boundaries
		if (y < radius || y > getHeight() - radius) {
			//dy *= -1; // Change direction
		}
		else if (y > radius || y < getHeight() - radius) {
			dy = 1; // Reset direction
		}
		
		// Adjust position
		y += dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
}
