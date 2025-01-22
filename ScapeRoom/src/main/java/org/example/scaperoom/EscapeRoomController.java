package org.example.scaperoom;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class EscapeRoomController {

    int contador = 0;
    int intentos = 0;
    boolean sala1Terminada = false, sala2Terminada = false, sala3Terminada = false;
    private long tiempoInicio;

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
    private Rectangle cuadradoBuscar;

    @FXML
    private Label sala1Completada;

    @FXML
    private Label sala2Completada;

    @FXML
    private Label sala3Completada;

    @FXML
    private Button comprobarAcertijo;

    @FXML
    private TextField fieldAcertijo;

    @FXML
    private Label textoPista1;

    @FXML
    private Label textoPista2;

    @FXML
    private Label textoPista3;

    @FXML
    private TextField textFieldCesar;

    @FXML
    private Button botonComprobarCesar;

    @FXML
    private Button botonSalir;

    @FXML
    private Label hasTardado;

    @FXML
    private Label tiempoTranscurrido;

    @FXML
    public void initialize() {
        botonSalir.setVisible(false);
        tiempoInicio = System.currentTimeMillis();
        new Thread(this::actualizarTiempoTranscurrido).start();    }

    @FXML
    private void actualizarTiempoTranscurrido() {
        while (true) {
            try {
                Thread.sleep(1000);
                long tiempoTranscurridoSegundos = (System.currentTimeMillis() - tiempoInicio) / 1000;
                Platform.runLater(() -> tiempoTranscurrido.setText(tiempoTranscurridoSegundos + " segundos"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

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

    @FXML
    public void findCuadrado(Event event) {
        cuadradoBuscar.setOpacity(1.0);
        sala1Completada.setOpacity(1.0);
        sala1Terminada = true;
        if (sala1Terminada && sala2Terminada && sala3Terminada) {
            botonSalir.setVisible(true);
            hasTardado.setVisible(true);

        }
    }


    @FXML
    public void comprobarRespuestaAcertijo(ActionEvent actionEvent) {
        String contestacion = fieldAcertijo.getText();
        if (contestacion.equals("botella")) {
            contador = +1;
            sala2Completada.setOpacity(1.0);
            sala2Terminada = true;
            if (sala1Terminada && sala2Terminada && sala3Terminada) {
                botonSalir.setVisible(true);
                hasTardado.setVisible(true);

            }
        } else {
            intentos += 1;
            if (intentos == 1) {
                textoPista1.setOpacity(1.0);
            } else if (intentos == 2) {
                textoPista2.setOpacity(1.0);
            } else if (intentos == 3) {
                textoPista3.setOpacity(1.0);
            }
        }
    }

    @FXML
    public void comprobarRespuestaCesar(ActionEvent actionEvent) {
        String contestacionCesar = textFieldCesar.getText().toUpperCase();
        if (contestacionCesar.equals("ME ENCANTA EL CLASH ROYALE")) {
            sala3Completada.setOpacity(1.0);
            sala3Terminada = true;
            if (sala1Terminada && sala2Terminada && sala3Terminada) {
                botonSalir.setVisible(true);
                hasTardado.setVisible(true);
            }
        }
    }

    @FXML
    public void volverAlPrincipal(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        GridPane root = loader.load();
        Stage currentStage = (Stage) botonSalir.getScene().getWindow();
        currentStage.close();
        Stage newStage = new Stage();
        newStage.setScene(new Scene(root));
        newStage.show();
    }
}
