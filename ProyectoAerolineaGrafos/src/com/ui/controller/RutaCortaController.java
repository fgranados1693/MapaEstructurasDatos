package com.ui.controller;

import com.bl.logic.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RutaCortaController implements Initializable {

    private static AppController pControlador = new AppController();

    @FXML
    private Button btnMenuRuta;

    @FXML
    private Button btnMenuDestino;

    @FXML
    private Button btnMenuVecinos;

    @FXML
    private ChoiceBox<String> cboxPaisesOrig;

    @FXML
    private Button btnBuscar;

    @FXML
    private ChoiceBox<String> cboxPaisesDest;

    @FXML
    private TextField resultadoPeso;

    @FXML
    private Text inputResultadoPuntos;

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

        cboxPaisesDest.getItems().addAll(pControlador.nombres);
        cboxPaisesOrig.getItems().addAll(pControlador.nombres);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }

    @FXML
    private void mostrarRuta(ActionEvent event) {
        //pControlador.buscarRuta(cboxPaisesOrig.getValue(),cboxPaisesDest.getValue());
        //System.out.println(cboxPaisesOrig.getValue() + cboxPaisesDest.getValue());

    }

    public void mostrarPeso (String data){
        String resultado = String.valueOf(data);
        resultadoPeso.setText(resultado);
        //System.out.println(resultado);
    }

}





