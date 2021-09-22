# Sabersmithy

## Synopsis
This program allows the user to build and name custom lightsaber objects from a list of parts. Custom sabers can either be saved to a gallery, or discarded.

## Motivation
This code was designed to stretch my abilities and understanding of developing GUI programs. It is my first major project that utilizes GUI.

## How to run
Upon startup the user is presented with two buttons: Forge and Gallery. Upon clicking the Gallery button, the user can view every Saber object that has been created. By default, there are four pre-built Sabers in the gallery. Upon clicking on the Forge button, the user is taken to a menu where they can create and name their own custom Saber object. There are four FlowPanes that correspond to the four components in a Saber object and are filled with buttons that have graphical previews of what each component looks like. When clicking on one of these buttons, the Saber preview in the center updates in real time. The user can name their Saber with the textfield at the bottom. Clicking the Save button adds the user's Saber to the gallery and adds it to the arraylist that contains all Saber objects. The Discard button navigates back to the Main Menu without saving the object anywhere.
![Code Running](/Final Project/SabersmithyDemo.png)

## Code Example
This code snippet shows the methods that were used to change the properties of a custom Saber object. These methods allowed for multiple actions to be taken when a button is pressed.
'''
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
'''
