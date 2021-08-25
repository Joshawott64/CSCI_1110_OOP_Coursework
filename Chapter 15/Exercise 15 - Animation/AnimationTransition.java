/*
 * Author: Joshua Gray
 * Date: 8/19/21
 * 
 * This program displays a rectangle moving along the path of a pentagon 
 * while changing opacity. The animation can be paused and unpaused by 
 * the left and right mouse buttons.
 */
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationTransition extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		// Create pane
		Pane pane = new Pane();
		
		// Create a rectangle
		Rectangle rectangle = new Rectangle (0, 0, 25, 50);
		rectangle.setFill(Color.DEEPPINK);
		
		// Create a pentagon
		Polygon pentagon = new Polygon();
		final double WIDTH = 200;
		final double HEIGHT = 200;
		pentagon.setFill(Color.AQUAMARINE);
		pentagon.setStroke(Color.BLACK);
		ObservableList<Double> list = pentagon.getPoints();
		
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.5;
	
		int s = 5;
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}
		
		pane.getChildren().clear();
		pentagon.setRotate(-18);

		// Add rectangle and pentagon to pane
		pane.getChildren().add(pentagon);
		pane.getChildren().add(rectangle);
	
		// Create a path transition
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(pentagon);
		pt.setNode(rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		pentagon.setOnMousePressed(e -> pt.pause());
		pentagon.setOnMouseReleased(e -> pt.play());
	
		// Create fade transition for rectangle
		FadeTransition ft = new FadeTransition(Duration.millis(4000), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		// Create scene and place it in stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("AnimationTransition");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}		
}
