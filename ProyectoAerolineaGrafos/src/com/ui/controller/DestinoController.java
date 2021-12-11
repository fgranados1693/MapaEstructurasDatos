package com.ui.controller;

import com.bl.logic.AppController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DestinoController implements Initializable {

    AppController appController = new AppController();

    @FXML
    private Button btnMenuRuta;

    @FXML
    private Button btnMenuDestino;

    @FXML
    private Button btnMenuVecinos;

    @FXML
    private ChoiceBox<String> cboxPaises;

    @FXML
    private Button btnBuscar;

    @FXML
    void OnBuscarDestinoClicked(MouseEvent event) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/destino.fxml"));
            ((Node) event.getSource()).getScene().getWindow().hide();//Esconde la ventana actual

        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setUserData(scene);
        stage.show();
    }

    @FXML
    void OnRutaCortaClicked(MouseEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/rutaCorta.fxml"));
            ((Node) event.getSource()).getScene().getWindow().hide();//Esconde la ventana actual

        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setUserData(scene);
        stage.show();
    }

    @FXML
    void OnVerVecinosClicked(MouseEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/vecinos.fxml"));
            ((Node) event.getSource()).getScene().getWindow().hide();//Esconde la ventana actual

        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setUserData(scene);
        stage.show();
    }

    private void loadData(){

        cboxPaises.getItems().addAll(appController.nombres);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }

}
