package org.example.scaperoom;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button Boton;

    @FXML
    private void abrirVentana() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("salas.fxml"));
        AnchorPane root = loader.load();
        Stage currentStage = (Stage) Boton.getScene().getWindow();
        currentStage.setScene(new Scene(root));
        currentStage.show();
    }
}