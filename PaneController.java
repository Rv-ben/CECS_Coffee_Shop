package application;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class PaneController {
	
	@FXML
	private Label ProductLabel;
	
	public void productButtonClicked(ActionEvent evt) {
		Node source = (Node) evt.getSource();
		ProductLabel.setText(source.getId());
	}
		
}
