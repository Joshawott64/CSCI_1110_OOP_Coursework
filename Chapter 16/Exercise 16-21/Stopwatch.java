/* Author: Joshua Gray
 * Date: 8/30/21
 * 
 * This program allows the user to enter time in seconds in a 
 * text field and use the Enter key to count down the seconds. 
 * When the seconds end, the program plays music continuously.
 */
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Stopwatch extends Application {
	private static final String MEDIA_URL = 
		"https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
	
	@Override
	public void start(Stage primaryStage) {
		// Create media
		Media media = new Media(MEDIA_URL);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		// Create text field
		TextField seconds = new TextField("Enter a number");
		seconds.setEditable(true);
		seconds.setFont(Font.font(20));
		seconds.setAlignment(Pos.CENTER);
		
		// Create animation for countdown
		Timeline animation = new Timeline(
			new KeyFrame(Duration.millis(1000), e -> { 
				int startInt = Integer.parseInt(seconds.getText());
				// Countdown loop
				if (startInt != 0) {
					startInt -= 1;
				}
				seconds.setText(String.valueOf(startInt));
				if (startInt == 0) {
					mediaPlayer.play();
				}
			}));
		
		animation.setCycleCount(Timeline.INDEFINITE);
		
		// Start animation when enter is pressed
		seconds.setOnAction(e -> {
			animation.play();
		});
		
		// Create stack pane
		StackPane pane = new StackPane();
		pane.getChildren().add(seconds);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("Stopwatch Countdown");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
