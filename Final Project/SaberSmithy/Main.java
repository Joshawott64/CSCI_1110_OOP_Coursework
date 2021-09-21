import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	// Establish scene names
	Scene mainMenu, forge, gallery, view;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Sabersmithy");
		
		// Import parts
		Image anakinEmitter = new Image("/Saber Parts/AnakinEmitter.png");
		Image anakinGuard = new Image("/Saber Parts/AnakinGuard.png");
		Image anakinSwitch = new Image("/Saber Parts/AnakinSwitch.png");
		Image anakinPommel = new Image("/Saber Parts/AnakinPommel.png");
		Image ahsokaEmitter = new Image("/Saber Parts/AhsokaEmitter.png");
		Image ahsokaGuard = new Image("/Saber Parts/AhsokaGuard.png");
		Image ahsokaSwitch = new Image("/Saber Parts/AhsokaSwitch.png");
		Image ahsokaPommel = new Image("/Saber Parts/AhsokaPommel.png");
		Image kalEmitter = new Image("/Saber Parts/KalEmitter.png");
		Image kalGuard = new Image("/Saber Parts/KalGuard.png");
		Image kalSwitch = new Image("/Saber Parts/KalSwitch.png");
		Image kalPommel = new Image("/Saber Parts/KalPommel.png");
		Image lukeEmitter = new Image("/Saber Parts/LukeEmitter.png");
		Image lukeGuard = new Image("/Saber Parts/LukeGuard.png");
		Image lukeSwitch = new Image("/Saber Parts/LukeSwitch.png");
		Image lukePommel = new Image("/Saber Parts/LukePommel.png");
		Image anakinBlack = new Image("/Colored Emitters/AnakinEmitter/AnakinBlack.png");
		Image anakinBlue = new Image("/Colored Emitters/AnakinEmitter/AnakinBlue.png");
		Image anakinGreen = new Image("/Colored Emitters/AnakinEmitter/AnakinGreen.png");
		Image anakinOrange = new Image("/Colored Emitters/AnakinEmitter/AnakinOrange.png");
		Image anakinPurple = new Image("/Colored Emitters/AnakinEmitter/AnakinPurple.png");
		Image anakinRed = new Image("/Colored Emitters/AnakinEmitter/AnakinRed.png");
		Image anakinSilver = new Image("/Colored Emitters/AnakinEmitter/AnakinSilver.png");
		Image anakinYellow = new Image("/Colored Emitters/AnakinEmitter/AnakinYellow.png");
		Image ahsokaBlack = new Image("/Colored Emitters/AhsokaEmitter/AhsokaBlack.png");
		Image ahsokaBlue = new Image("/Colored Emitters/AhsokaEmitter/AhsokaBlue.png");
		Image ahsokaGreen = new Image("/Colored Emitters/AhsokaEmitter/AhsokaGreen.png");
		Image ahsokaOrange = new Image("/Colored Emitters/AhsokaEmitter/AhsokaOrange.png");
		Image ahsokaPurple = new Image("/Colored Emitters/AhsokaEmitter/AhsokaPurple.png");
		Image ahsokaRed = new Image("/Colored Emitters/AhsokaEmitter/AhsokaRed.png");
		Image ahsokaSilver = new Image("/Colored Emitters/AhsokaEmitter/AhsokaSilver.png");
		Image ahsokaYellow = new Image("/Colored Emitters/AhsokaEmitter/AhsokaYellow.png");
		Image kalBlack = new Image("/Colored Emitters/KalEmitter/KalBlack.png");
		Image kalBlue = new Image("/Colored Emitters/KalEmitter/KalBlue.png");
		Image kalGreen = new Image("/Colored Emitters/KalEmitter/KalGreen.png");
		Image kalOrange = new Image("/Colored Emitters/KalEmitter/KalOrange.png");
		Image kalPurple = new Image("/Colored Emitters/KalEmitter/KalPurple.png");
		Image kalRed = new Image("/Colored Emitters/KalEmitter/KalRed.png");
		Image kalSilver = new Image("/Colored Emitters/KalEmitter/KalSilver.png");
		Image kalYellow = new Image("/Colored Emitters/KalEmitter/KalYellow.png");
		Image lukeBlack = new Image("/Colored Emitters/LukeEmitter/LukeBlack.png");
		Image lukeBlue = new Image("/Colored Emitters/LukeEmitter/LukeBlue.png");
		Image lukeGreen = new Image("/Colored Emitters/LukeEmitter/LukeGreen.png");
		Image lukeOrange = new Image("/Colored Emitters/LukeEmitter/LukeOrange.png");
		Image lukePurple = new Image("/Colored Emitters/LukeEmitter/LukePurple.png");
		Image lukeRed = new Image("/Colored Emitters/LukeEmitter/LukeRed.png");
		Image lukeSilver = new Image("/Colored Emitters/LukeEmitter/LukeSilver.png");
		Image lukeYellow = new Image("/Colored Emitters/LukeEmitter/LukeYellow.png");
		
		ArrayList<Image> emitters = new ArrayList<Image>();
		emitters.add(anakinEmitter);
		emitters.add(ahsokaEmitter);
		emitters.add(kalEmitter);
		emitters.add(lukeEmitter);
		
		ArrayList<Image> guards = new ArrayList<Image>();
		guards.add(anakinGuard);
		guards.add(ahsokaGuard);
		guards.add(kalGuard);
		guards.add(lukeGuard);
		
		ArrayList<Image> switches = new ArrayList<Image>();
		switches.add(anakinSwitch);
		switches.add(ahsokaSwitch);
		switches.add(kalSwitch);
		switches.add(lukeSwitch);
		
		ArrayList<Image> pommels = new ArrayList<Image>();
		pommels.add(anakinPommel);
		pommels.add(ahsokaPommel);
		pommels.add(kalPommel);
		pommels.add(lukePommel);
		
		// Construct default sabers
		Saber anakinSaber = new Saber(true, "The Skywalker", emitters.get(0), 
			guards.get(0), switches.get(0), pommels.get(0));
		Saber ashokaSaber = new Saber(true, "The Fulcrum", emitters.get(1), 
			guards.get(1), switches.get(1), pommels.get(1));
		Saber kalSaber = new Saber(true, "The Fallen", emitters.get(2), 
			guards.get(2), switches.get(2), pommels.get(2));
		Saber lukeSaber = new Saber(true, "The Prodigal Son", emitters.get(3), 
			guards.get(3), switches.get(3), pommels.get(3));
		
		// Store all sabers in ArrayList
		ArrayList<Saber> allSabers = new ArrayList<Saber>();
		allSabers.add(anakinSaber);
		allSabers.add(ashokaSaber);
		allSabers.add(kalSaber);
		allSabers.add(lukeSaber);
		
		
		
		
		
		/** Start of Main Menu scene */
		
		BorderPane mainMenuPane = new BorderPane();
		
		// Place nodes in pane
		
		// Title
		HBox titleBoxMainMenu = new HBox();
		titleBoxMainMenu.setAlignment(Pos.CENTER);
		Text title = new Text("Sabersmithy");
		titleBoxMainMenu.getChildren().add(title);
		mainMenuPane.setTop(titleBoxMainMenu);
		
		// HBox for buttons
		HBox buttonBoxMainMenu = new HBox(20);
		buttonBoxMainMenu.setAlignment(Pos.CENTER);
		mainMenuPane.setCenter(buttonBoxMainMenu);
		
		// Navigate to Forge
		Button btForge = new Button("Forge");
		btForge.setOnAction(e -> primaryStage.setScene(forge));
		
		// Navigate to Gallery
		Button btGallery = new Button("Gallery");
		btGallery.setOnAction(e -> primaryStage.setScene(gallery));
		
		// Add buttons to buttonBox
		buttonBoxMainMenu.getChildren().addAll(btForge, btGallery);
		
		mainMenu = new Scene(mainMenuPane, 1280, 720);
		
		/** End of Main Menu scene */
		
		
		
		
		
		/** Start of Gallery scene */
		
		// Set up Border and Flow panes
		BorderPane galleryBorderPane = new BorderPane();
		FlowPane galleryFlowPane = new FlowPane();
		galleryFlowPane.setPadding(new Insets(50, 150, 50, 150));
		galleryFlowPane.setHgap(100);
		galleryFlowPane.setVgap(200);
		
		// Place saberPane in a ScrollPane
		ScrollPane galleryScrollPane = new ScrollPane();
		galleryScrollPane.setContent(galleryFlowPane);
		galleryScrollPane.hbarPolicyProperty().setValue(
				ScrollPane.ScrollBarPolicy.NEVER);
		galleryScrollPane.setFitToWidth(true);
		galleryScrollPane.setFitToHeight(true);
		
		// Place nodes in galleryFlowPane
		
		// Title
		HBox galleryTitleBox = new HBox();
		galleryTitleBox.setAlignment(Pos.CENTER);
		Text galleryTitle = new Text("Gallery");
		galleryTitleBox.getChildren().add(galleryTitle);
		
		// HBox for back button
		HBox buttonBoxGallery = new HBox();
		buttonBoxGallery.setAlignment(Pos.TOP_LEFT);
		Button btBackGallery = new Button("<--");
		btBackGallery.setOnAction(e -> primaryStage.setScene(mainMenu));
		buttonBoxGallery.getChildren().add(btBackGallery);
		
		// Display all sabers on galleryFlowPane
		for (int i = 0; i < allSabers.size(); i++) {
			VBox saberBox = new VBox();
			ImageView emitter = new ImageView(allSabers.get(i).getEmitter());
			ImageView guard = new ImageView(allSabers.get(i).getGuard());
			ImageView bladeSwitch = new ImageView(allSabers.get(i).getBladeSwitch());
			ImageView pommel = new ImageView(allSabers.get(i).getPommel());
			saberBox.getChildren().addAll(emitter, guard, bladeSwitch, pommel);
			
			HBox formatBox = new HBox(20);
			formatBox.getChildren().add(saberBox);
			formatBox.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;");
			formatBox.setPrefWidth(200);
			formatBox.setPrefHeight(200);
			
			
			Label saberLabel = new Label(allSabers.get(i).getName(), formatBox);
			saberLabel.setContentDisplay(ContentDisplay.TOP);
			
			/*
			 *  Add different ComboBoxes based on if the saber default 
			 *  or not
			 */
			if (allSabers.get(i).getIsDefault() == true) {
				ComboBox<String> cbo = new ComboBox<>();
				cbo.getItems().add("View");
				formatBox.getChildren().add(cbo);
			}
			else if (allSabers.get(i).getIsDefault() == false) {
				ComboBox<String> cbo = new ComboBox<>();
				cbo.getItems().addAll("View", "Edit", "Delete");
				formatBox.getChildren().add(cbo);
			}
			
			// Add sabers and labels to FlowPane
			galleryFlowPane.getChildren().add(formatBox);
			galleryFlowPane.getChildren().add(saberLabel);
		}
		
		galleryFlowPane.setStyle("-fx-background-color: lightblue");
		
		// Set locations for HBoxes
		galleryBorderPane.setTop(galleryTitleBox);
		galleryBorderPane.setLeft(buttonBoxGallery);
		galleryBorderPane.setCenter(galleryScrollPane);
		
		// Create scene and place it in stage
		gallery = new Scene(galleryBorderPane, 1280, 720);
		
		/** End of Gallery scene */
		
		
		
		
		
		/** Star of Forge scene */
		
		// Set up BorderPane and FlowPanes
		BorderPane forgeBorderPane = new BorderPane();
		
		FlowPane emitterPane = new FlowPane();
		emitterPane.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;");
		emitterPane.setPadding(new Insets(5, 5, 5, 5));
		Label emitterLabel = new Label("Emitters", emitterPane);
		emitterLabel.setContentDisplay(ContentDisplay.BOTTOM);
		
		FlowPane guardPane = new FlowPane();
		guardPane.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;");
		guardPane.setPadding(new Insets(5, 5, 5, 5));
		Label guardLabel = new Label("Guards", guardPane);
		guardLabel.setContentDisplay(ContentDisplay.BOTTOM);
		
		FlowPane colorPane = new FlowPane();
		colorPane.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;");
		colorPane.setPadding(new Insets(5, 5, 5, 5));
		Label colorLabel = new Label("Colors", colorPane);
		colorLabel.setContentDisplay(ContentDisplay.BOTTOM);
		
		FlowPane switchPane = new FlowPane();
		switchPane.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;");
		switchPane.setPadding(new Insets(5, 5, 5, 5));
		Label switchLabel = new Label("Switches", switchPane);
		switchLabel.setContentDisplay(ContentDisplay.BOTTOM);
		
		FlowPane pommelPane = new FlowPane();
		pommelPane.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;");
		pommelPane.setPadding(new Insets(5, 5, 5, 5));
		Label pommelLabel = new Label("Pommels", pommelPane);
		pommelLabel.setContentDisplay(ContentDisplay.BOTTOM);
		
		// Place FlowPanes in VBoxes
		VBox leftBox = new VBox(20);
		leftBox.getChildren().addAll(emitterPane, guardPane);
		
		VBox rightBox = new VBox(20);
		rightBox.getChildren().addAll(colorPane, switchPane, pommelPane);
		
		// Place nodes in BorderPane
		
		// Create saber object
		Saber customSaber = new Saber();
			
		// VBox for displaying customSaber
		VBox customSaberBox = new VBox();
		customSaberBox.setAlignment(Pos.BOTTOM_CENTER);
		ImageView customEmitter = new ImageView(customSaber.getEmitter());
		ImageView customGuard = new ImageView(customSaber.getGuard());
		ImageView customSwitch = new ImageView(customSaber.getBladeSwitch());
		ImageView customPommel = new ImageView(customSaber.getPommel());
		customSaberBox.getChildren().addAll(customEmitter, customGuard, 
				customSwitch, customPommel);
				
		HBox bottomBox = new HBox(100);
		bottomBox.setAlignment(Pos.CENTER);
				
		HBox nameBox = new HBox();
		nameBox.setAlignment(Pos.CENTER);
		TextField name = new TextField(customSaber.getName());
		name.setEditable(true);
		name.setAlignment(Pos.BASELINE_CENTER);
		name.setOnAction(e -> customSaber.setName(name.getText()));
		nameBox.getChildren().add(name);
				
		HBox buttonBox = new HBox(20);
		buttonBox.setAlignment(Pos.BOTTOM_LEFT);
		Button btSave = new Button("Save");
		btSave.setOnAction(e -> {
			addCustomSaber(customSaber, allSabers, galleryFlowPane, primaryStage);
		});
				
		Button btDiscard = new Button("Discard");
		btDiscard.setOnAction(e -> {
			primaryStage.setScene(mainMenu);
		});
				
		Button btTest = new Button("Test");
		btTest.setOnAction(e -> {
				
		});
		
		buttonBox.getChildren().addAll(btSave, btDiscard, btTest);
				
		bottomBox.getChildren().addAll(buttonBox, nameBox);
		
		// Place nodes in FlowPanes
		
		/* Emitters */
		ImageView anakinEmitterView = new ImageView(anakinEmitter);
		anakinEmitterView.setFitHeight(50);
		anakinEmitterView.setFitHeight(50);
		Button btAnakinEmitter = new Button();
		btAnakinEmitter.setGraphic(anakinEmitterView);
		btAnakinEmitter.setOnAction(e -> {
			changeEmitter(customSaber, customSaberBox, anakinEmitter);
		});
		
		ImageView ahsokaEmitterView = new ImageView(ahsokaEmitter);
		ahsokaEmitterView.setFitHeight(50);
		ahsokaEmitterView.setFitWidth(50);
		Button btAhsokaEmitter = new Button();
		btAhsokaEmitter.setGraphic(ahsokaEmitterView);
		btAhsokaEmitter.setOnAction(e -> {
			changeEmitter(customSaber, customSaberBox, ahsokaEmitter);
		});
		
		ImageView kalEmitterView = new ImageView(kalEmitter);
		kalEmitterView.setFitHeight(50);
		kalEmitterView.setFitWidth(50);
		Button btKalEmitter = new Button();
		btKalEmitter.setGraphic(kalEmitterView);
		btKalEmitter.setOnAction(e -> {
			changeEmitter(customSaber, customSaberBox, kalEmitter);
		});
		
		ImageView lukeEmitterView = new ImageView(lukeEmitter);
		lukeEmitterView.setFitHeight(50);
		lukeEmitterView.setFitWidth(50);
		Button btLukeEmitter = new Button();
		btLukeEmitter.setGraphic(lukeEmitterView);
		btLukeEmitter.setOnAction(e -> {
			changeEmitter(customSaber, customSaberBox, lukeEmitter);
		});
		
		emitterPane.getChildren().addAll(btAnakinEmitter, btAhsokaEmitter, 
				btKalEmitter, btLukeEmitter);
		
		/* Guards */
		ImageView anakinGuardView = new ImageView(anakinGuard);
		anakinGuardView.setFitHeight(50);
		anakinGuardView.setFitWidth(50);
		Button btAnakinGuard = new Button();
		btAnakinGuard.setGraphic(anakinGuardView);
		btAnakinGuard.setOnAction(e -> {
			changeGuard(customSaber, customSaberBox, anakinGuard);
		});
		
		ImageView ahsokaGuardView = new ImageView(ahsokaGuard);
		ahsokaGuardView.setFitHeight(50);
		ahsokaGuardView.setFitWidth(50);
		Button btAhsokaGuard = new Button();
		btAhsokaGuard.setGraphic(ahsokaGuardView);
		btAhsokaGuard.setOnAction(e -> {
			changeGuard(customSaber, customSaberBox, ahsokaGuard);
		});
		
		ImageView kalGuardView = new ImageView(kalGuard);
		kalGuardView.setFitHeight(50);
		kalGuardView.setFitWidth(50);
		Button btKalGuard = new Button();
		btKalGuard.setGraphic(kalGuardView);
		btKalGuard.setOnAction(e -> {
			changeGuard(customSaber, customSaberBox, kalGuard);
		});
		
		ImageView lukeGuardView = new ImageView(lukeGuard);
		lukeGuardView.setFitHeight(50);
		lukeGuardView.setFitWidth(50);
		Button btLukeGuard = new Button();
		btLukeGuard.setGraphic(lukeGuardView);
		btLukeGuard.setOnAction(e -> {
			changeGuard(customSaber, customSaberBox, lukeGuard);
		});
		
		guardPane.getChildren().addAll(btAnakinGuard, btAhsokaGuard, 
				btKalGuard, btLukeGuard);
		
		/* Colors */
		Text teaser = new Text("Blades and Blade Colors coming soon!");
		colorPane.getChildren().addAll(teaser);
		
		/* Switches */
		ImageView anakinSwitchView = new ImageView(anakinSwitch);
		anakinSwitchView.setFitHeight(50);
		anakinSwitchView.setFitWidth(50);
		Button btAnakinSwitch = new Button();
		btAnakinSwitch.setGraphic(anakinSwitchView);
		btAnakinSwitch.setOnAction(e -> {
			changeSwitch(customSaber, customSaberBox, anakinSwitch);
		});
		
		ImageView ahsokaSwitchView = new ImageView(ahsokaSwitch);
		ahsokaSwitchView.setFitHeight(50);
		ahsokaSwitchView.setFitWidth(50);
		Button btAhsokaSwitch = new Button();
		btAhsokaSwitch.setGraphic(ahsokaSwitchView);
		btAhsokaSwitch.setOnAction(e -> {
			changeSwitch(customSaber, customSaberBox, ahsokaSwitch);
		});
		
		ImageView kalSwitchView = new ImageView(kalSwitch);
		kalSwitchView.setFitHeight(50);
		kalSwitchView.setFitWidth(50);
		Button btKalSwitch = new Button();
		btKalSwitch.setGraphic(kalSwitchView);
		btKalSwitch.setOnAction(e -> {
			changeSwitch(customSaber, customSaberBox, kalSwitch);
		});
		
		ImageView lukeSwitchView = new ImageView(lukeSwitch);
		lukeSwitchView.setFitHeight(50);
		lukeSwitchView.setFitWidth(50);
		Button btLukeSwitch = new Button();
		btLukeSwitch.setGraphic(lukeSwitchView);
		btLukeSwitch.setOnAction(e -> {
			changeSwitch(customSaber, customSaberBox, lukeSwitch);
		});
		
		switchPane.getChildren().addAll(btAnakinSwitch, 
				btAhsokaSwitch, btKalSwitch, btLukeSwitch);
		
		/* Pommels */
		ImageView anakinPommelView = new ImageView(anakinPommel);
		anakinPommelView.setFitHeight(50);
		anakinPommelView.setFitWidth(50);
		Button btAnakinPommel = new Button();
		btAnakinPommel.setGraphic(anakinPommelView);
		btAnakinPommel.setOnAction(e -> {
			changePommel(customSaber, customSaberBox, anakinPommel);
		});
		
		ImageView ahsokaPommelView = new ImageView(ahsokaPommel);
		ahsokaPommelView.setFitHeight(50);
		ahsokaPommelView.setFitWidth(50);
		Button btAhsokaPommel = new Button();
		btAhsokaPommel.setGraphic(ahsokaPommelView);
		btAhsokaPommel.setOnAction(e -> {
			changePommel(customSaber, customSaberBox, ahsokaPommel);
		});
		
		ImageView kalPommelView = new ImageView(kalPommel);
		kalPommelView.setFitHeight(50);
		kalPommelView.setFitWidth(50);
		Button btKalPommel = new Button();
		btKalPommel.setGraphic(kalPommelView);
		btKalPommel.setOnAction(e -> {
			changePommel(customSaber, customSaberBox, kalPommel);
		});
		
		ImageView lukePommelView = new ImageView(lukePommel);
		lukePommelView.setFitHeight(50);
		lukePommelView.setFitWidth(50);
		Button btLukePommel = new Button();
		btLukePommel.setGraphic(lukePommelView);
		btLukePommel.setOnAction(e -> {
			changePommel(customSaber, customSaberBox, lukePommel);
		});
		
		pommelPane.getChildren().addAll(btAnakinPommel, btAhsokaPommel, 
				btKalPommel, btLukePommel);
		
		// Set locations for content in BorderPane
		forgeBorderPane.setLeft(leftBox);
		forgeBorderPane.setRight(rightBox);
		forgeBorderPane.setBottom(bottomBox);
		forgeBorderPane.setCenter(customSaberBox);
		
		forge = new Scene(forgeBorderPane, 1280, 720);
		
		/** End of Forge scene */
		
		
		
		// Set primary stage
		primaryStage.setScene(mainMenu);
		primaryStage.show();
	}

	// Main method
	public static void main(String[] args) {
		launch(args);
	}
	
	// Adds a custom saber object to galleryFlowPane
	public void addCustomSaber(Saber customSaber, 
			ArrayList<Saber> allSabers, FlowPane galleryFlowPane, 
			Stage primaryStage) {
		// Add saber to list
		allSabers.add(customSaber);
		VBox saberBox = new VBox();
		ImageView emitter = new ImageView(customSaber.getEmitter());
		ImageView guard = new ImageView(customSaber.getGuard());
		ImageView bladeSwitch = new ImageView(customSaber.getBladeSwitch());
		ImageView pommel = new ImageView(customSaber.getPommel());
		saberBox.getChildren().addAll(emitter, guard, bladeSwitch, pommel);
		
		HBox formatBox = new HBox();
		formatBox.getChildren().add(saberBox);
		formatBox.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;");
		formatBox.setPrefWidth(200);
		formatBox.setPrefHeight(200);
		
		Label saberLabel = new Label(customSaber.getName(), formatBox);
		saberLabel.setContentDisplay(ContentDisplay.TOP);
		
		/*
		 *  Add different ComboBoxes based on if the saber default 
		 *  or not
		 */
		if (customSaber.getIsDefault() == true) {
			ComboBox<String> cbo = new ComboBox<>();
			cbo.getItems().add("View");
			formatBox.getChildren().add(cbo);
		}
		else if (customSaber.getIsDefault() == false) {
			ComboBox<String> cbo = new ComboBox<>();
			cbo.getItems().addAll("View", "Edit", "Delete");
			formatBox.getChildren().add(cbo);
		}
		
		// Add sabers and labels to FlowPane
		galleryFlowPane.getChildren().add(formatBox);
		galleryFlowPane.getChildren().add(saberLabel);
		
		primaryStage.setScene(mainMenu);
	}
	
	// Changes customSaber's emitter
	public static void changeEmitter(Saber customSaber, 
			VBox customSaberBox, Image newEmitter) {
		customSaber.setEmitter(newEmitter);
		ImageView newEmitterView = new ImageView(newEmitter);
		customSaberBox.getChildren().set(0, newEmitterView);
	}
	
	// Changes customSaber's guard
	public static void changeGuard(Saber customSaber, 
			VBox customSaberBox, Image newGuard) {
		customSaber.setGuard(newGuard);
		ImageView newGuardView = new ImageView(newGuard);
		customSaberBox.getChildren().set(1, newGuardView);
	}
	
	// Changes customSaber's switch
	public static void changeSwitch(Saber customSaber, 
			VBox customSaberBox, Image newBladeSwitch) {
		customSaber.setBladeSwitch(newBladeSwitch);
		ImageView newBladeSwitchView = new ImageView(newBladeSwitch);
		customSaberBox.getChildren().set(2, newBladeSwitchView);
	}
	
	// Changes customSaber's pommel
	public static void changePommel(Saber customSaber, 
			VBox customSaberBox, Image newPommel) {
		customSaber.setPommel(newPommel);
		ImageView newPommelView = new ImageView(newPommel);
		customSaberBox.getChildren().set(3, newPommelView);
	}
	
}
