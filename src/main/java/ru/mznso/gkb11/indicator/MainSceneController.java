package ru.mznso.gkb11.indicator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainSceneController {
	
	@FXML
	private Button mainButton;
	
	@FXML
	private Label labelTmp;
	
	@FXML
	public void buttonClicked() {
//		System.out.println("Button clicked!");
		mainButton.setText("Click me again!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		labelTmp.setText("Показатели");
	}
}
