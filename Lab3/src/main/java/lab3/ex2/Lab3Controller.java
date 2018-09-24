package lab3.ex2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Lab3Controller {

    @FXML
    private Button button1;

    @FXML
    private Label label1;

    @FXML
    void buttonPressed(ActionEvent event) {
    	label1.setText("Welcome to JavaFX");
    }

}
