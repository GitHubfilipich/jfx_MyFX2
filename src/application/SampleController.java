package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.scene.control.Button;


import javafx.event.ActionEvent;

public class SampleController {
	@FXML TextField textField1;
	@FXML Button btn1;
	
	@FXML public void btn1Click(ActionEvent event) {
		textField1.setText("Привет!");
		FileChooser fil_chooser = new FileChooser();
		fil_chooser.showOpenDialog(null);
		textField1.setText("File chosen :)");
	}
	
}
