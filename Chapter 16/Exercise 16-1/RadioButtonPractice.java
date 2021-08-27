/*
 * Author: Joshua Gray
 * Date: 8/27/21
 * 
 * This program utilizes buttons and radio buttons to move a text 
 * object left or right and change its color.
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioButtonPractice extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create text object
		Text text = new Text(100, 100, "Programming is fun");
		text.setFont(Font.font(20));
		
		// Create HBox for left/right buttons
		HBox movementButtons = new HBox(20);
		
		// Create left/right buttons
		Button btLeft = new Button("<=");
		Button btRight = new Button("=>");
		
		movementButtons.getChildren().addAll(btLeft, btRight);
		movementButtons.setAlignment(Pos.CENTER);
		movementButtons.setStyle("-fx-border-width: 1px; -fx-border-color: black");
		
		// Move text
		btLeft.setOnAction(e -> {
			text.setX(text.getX() - 10);
			// Keep text on pane
			if (text.getX() == -10) {
				text.setX(text.getX() + 10);
			}
		});
		btRight.setOnAction(e -> {
			text.setX(text.getX() + 10);
			// Keep text on pane
			if (text.getX() == 300) {
				text.setX(text.getX() - 10);
			}
		});
				
		// Create HBox for color radio buttons
		HBox colorButtons = new HBox(20);
		
		// Create color radio buttons
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbBlack = new RadioButton("Black");
		RadioButton rbOrange = new RadioButton("Orange");
		RadioButton rbGreen = new RadioButton("Green");
		
		colorButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, 
				rbOrange, rbGreen);
		colorButtons.setAlignment(Pos.CENTER);
		colorButtons.setStyle("-fx-border-width: 1px; -fx-border-color: black");
		
		// Group radio buttons
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbBlack.setToggleGroup(group);
		rbOrange.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		
		// Change text color
		rbRed.setOnAction(e -> {
			if (rbRed.isSelected()) {
				text.setStroke(Color.RED);
			}
		});
		
		rbYellow.setOnAction(e -> {
			if (rbYellow.isSelected()) {
				text.setStroke(Color.YELLOW);
			}
		});
		
		rbBlack.setOnAction(e -> {
			if (rbBlack.isSelected()) {
				text.setStroke(Color.BLACK);
			}
		});
		
		rbOrange.setOnAction(e -> {
			if (rbOrange.isSelected()) {
				text.setStroke(Color.ORANGE);
			}
		});
		
		rbGreen.setOnAction(e -> {
			if (rbGreen.isSelected()) {
				text.setStroke(Color.GREEN);
			}
		});
		
		// Create border pane
		BorderPane pane = new BorderPane();
		pane.getChildren().add(text);
		pane.setBottom(movementButtons);
		pane.setTop(colorButtons);
		
		// Set scene
		Scene scene = new Scene(pane, 450, 200);
		primaryStage.setTitle("TextApp");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
