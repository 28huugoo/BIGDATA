/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author FP
 */
public class AltaPersonajeController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtTitulos;
    @FXML
    private TextField txtPeso;
    @FXML
    private TextField txtAltura;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CrearPersonaje(ActionEvent event) {
    }

    @FXML
    private void MosrarPersonaje(ActionEvent event) {
    }
    
}
