package ru.mznso.gkb11.indicator;

	import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Indicator extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Показатели деятельности");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/mainScene.fxml"));
		MainSceneController controller = loader.getController();
//		URL xmlUrl = getClass().getResource("/mainScene.fxml");
//		loader.setController(new MainSceneController());
//		loader.setLocation(xmlUrl);
		Parent root = loader.load();
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
}
	