package com.example.proyectomathsocket;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControladorVentanaPrincipal {
    @FXML
    private Label welcomeText;
    @FXML
    private Label botonDeSalida;

    @FXML
    protected void onHelloButtonClick() {
        int Numero = (int) (Math.random()*4+1);
        welcomeText.setText(String.valueOf(Numero));
    }

    @FXML
    protected void onExitButtonClick(){
        Stage stage = (Stage) this.botonDeSalida.getScene().getWindow();
        stage.close();
    }
}