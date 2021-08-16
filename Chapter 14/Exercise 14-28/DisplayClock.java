/*
 * Author: Joshua Gray
 * Date: 8/16/21
 * 
 * This program generates a random time and displays the 
 * minute and hour hands.
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class DisplayClock extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create random numbers
		int hour = (int) (Math.random() * 11);
		int minute = (int) (Math.random() * 30);
		int second = (int) (Math.random() * 60);
		// Create clock and label
		ClockPane clock = new ClockPane(hour, minute, second, true, true, false);
		String timeString = clock.getHour() + ":" + clock.getMinute() 
			+ ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);
		
		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
