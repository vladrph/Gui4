package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {


    @FXML
    private Label lblName;

    @FXML
    private Button btnSubmit;

    @FXML
    private TextField txtName;

    @FXML
    void showName(MouseEvent event) {
        String name;
         name = txtName.getText();
     //  System.out.println(name);
     lblName.setText(name);


    }

}
