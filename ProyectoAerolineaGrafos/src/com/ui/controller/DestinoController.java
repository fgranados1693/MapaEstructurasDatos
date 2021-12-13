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
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DestinoController implements Initializable {

    AppController appController = new AppController();

    private Stage stage;
    private Scene scene;
    private Parent root;

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
    private Circle dot0;

    @FXML
    private Circle dot2;

    @FXML
    private Circle dot1;

    @FXML
    private Circle dot3;

    @FXML
    private Circle dot4;

    @FXML
    private Circle dot5;

    @FXML
    private Circle dot6;

    @FXML
    private Circle dot7;

    @FXML
    private Circle dot8;

    @FXML
    private Circle dot9;

    @FXML
    private Circle dot10;

    @FXML
    private Circle dot11;

    @FXML
    private Circle dot12;

    @FXML
    private Circle dot13;

    @FXML
    private Circle dot14;

    @FXML
    private Circle dot15;

    @FXML
    private Circle dot16;

    @FXML
    private Circle dot17;

    @FXML
    private Circle dot18;

    @FXML
    private Circle dot19;

    @FXML
    private Circle dot20;

    @FXML
    private Circle dot21;

    @FXML
    private Circle dot22;

    @FXML
    private Circle dot23;

    @FXML
    private Circle dot24;


    @FXML
    void OnBuscarDestinoClicked(MouseEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("../view/destino.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnRutaCortaClicked(MouseEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("../view/rutaCorta.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnVerVecinosClicked(MouseEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("../view/vecinos.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void loadData() {

        cboxPaises.getItems().addAll(appController.nombres);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }

    @FXML
    void onBuscarClicked(ActionEvent event) {

        boolean status = appController.tablaHash(cboxPaises.getValue());
        int op = appController.convertirString(cboxPaises.getValue());
        String color = "#6FCF97";
        double radio = 10;

        if (op == 0) {
            dot0.setVisible(status);
            dot0.setFill(Color.web(color));
            dot0.setRadius(radio);
        } else if (op == 1) {
            dot1.setVisible(status);
            dot1.setFill(Color.web(color));
            dot1.setRadius(radio);
        } else if (op == 2) {
            dot2.setVisible(status);
            dot2.setFill(Color.web(color));
            dot2.setRadius(radio);
        } else if (op == 3) {
            dot3.setVisible(status);
            dot3.setFill(Color.web(color));
            dot3.setRadius(radio);
        } else if (op == 4) {
            dot4.setVisible(status);
            dot4.setFill(Color.web(color));
            dot4.setRadius(radio);
        } else if (op == 5) {
            dot5.setVisible(status);
            dot5.setFill(Color.web(color));
            dot5.setRadius(radio);
        } else if (op == 6) {
            dot6.setVisible(status);
            dot6.setFill(Color.web(color));
            dot6.setRadius(radio);
        } else if (op == 7) {
            dot7.setVisible(status);
            dot7.setFill(Color.web(color));
            dot7.setRadius(radio);
        } else if (op == 8) {
            dot8.setVisible(status);
            dot8.setFill(Color.web(color));
            dot8.setRadius(radio);
        } else if (op == 9) {
            dot9.setVisible(status);
            dot9.setFill(Color.web(color));
            dot9.setRadius(radio);
        } else if (op == 10) {
            dot10.setVisible(status);
            dot10.setFill(Color.web(color));
            dot10.setRadius(radio);
        } else if (op == 11) {
            dot11.setVisible(status);
            dot11.setFill(Color.web(color));
            dot11.setRadius(radio);
        } else if (op == 12) {
            dot12.setVisible(status);
            dot12.setFill(Color.web(color));
            dot12.setRadius(radio);
        } else if (op == 13) {
            dot13.setVisible(status);
            dot13.setFill(Color.web(color));
            dot13.setRadius(radio);
        } else if (op == 14) {
            dot14.setVisible(status);
            dot14.setFill(Color.web(color));
            dot14.setRadius(radio);
        } else if (op == 15) {
            dot15.setVisible(status);
            dot15.setFill(Color.web(color));
            dot15.setRadius(radio);
        } else if (op == 16) {
            dot16.setVisible(status);
            dot16.setFill(Color.web(color));
            dot16.setRadius(radio);
        } else if (op == 17) {
            dot17.setVisible(status);
            dot17.setFill(Color.web(color));
            dot17.setRadius(radio);
        } else if (op == 18) {
            dot18.setVisible(status);
            dot18.setFill(Color.web(color));
            dot18.setRadius(radio);
        } else if (op == 19) {
            dot19.setVisible(status);
            dot19.setFill(Color.web(color));
            dot19.setRadius(radio);
        } else if (op == 20) {
            dot20.setVisible(status);
            dot20.setFill(Color.web(color));
            dot20.setRadius(radio);
        } else if (op == 21) {
            dot21.setVisible(status);
            dot21.setFill(Color.web(color));
            dot21.setRadius(radio);
        } else if (op == 22) {
            dot22.setVisible(status);
            dot22.setFill(Color.web(color));
            dot22.setRadius(radio);
        } else if (op == 23) {
            dot23.setVisible(status);
            dot23.setFill(Color.web(color));
            dot23.setRadius(radio);
        } else if (op == 24) {
            dot24.setVisible(status);
            dot24.setFill(Color.web(color));
            dot24.setRadius(radio);
        }
    }
}
