package de.easeefficiency.budgetplanning;

import org.pmw.tinylog.Logger;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);	
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Logger.info("Application start.");
		primaryStage.setTitle("BUDGET PLANNING");
		primaryStage.show();
	}

}
