package org.example.scaperoom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class EscapeRoomController {

    @FXML
    private TextField nameField;

    @FXML
    private AnchorPane sala1;

    @FXML
    private AnchorPane sala2;

    @FXML
    private AnchorPane sala3;

    @FXML
    private StackPane stackPane;


    @FXML
    public void goToSala1() {
        sala1.setVisible(true);
        sala2.setVisible(false);
        sala3.setVisible(false);
    }

    @FXML
    public void goToSala2() {
        sala1.setVisible(false);
        sala2.setVisible(true);
        sala3.setVisible(false);
    }

    @FXML
    public void goToSala3() {
        sala1.setVisible(false);
        sala2.setVisible(false);
        sala3.setVisible(true);
    }
}
