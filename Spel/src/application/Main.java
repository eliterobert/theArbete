package application;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	private final int SCREEN_WIDTH = 1024;
	private final int SCREEN_HEIGHT = 768;
	private String mapPath;
	private Stage stage;

	@Override
	public void start(Stage primaryStage) {
		try {

			mapPath = "RobertsBana.fxml";
			URL location = this.getClass().getResource(mapPath);
			FXMLLoader loader = new FXMLLoader(location);
			Parent root = loader.load();
			Scene scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage = primaryStage;
			stage.setScene(scene);
			stage.show();
			stage.setFullScreen(true);
			root.requestFocus();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public String getMapPath() {
		return mapPath;
	}

	public void setMapPath(String mapPath) {
		this.mapPath = mapPath;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
