package application;
	
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

	FXMLLoader loader = new FXMLLoader();
	public void start(Stage primaryStage) {
		try {
			URL url = new File("src/application/LoginPage.fxml").toURI().toURL();
			Parent roots=FXMLLoader.load(url);
			Scene scene = new Scene(roots);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
