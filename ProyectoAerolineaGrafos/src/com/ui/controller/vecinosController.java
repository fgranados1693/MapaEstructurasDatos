package com.ui.controller;

import com.bl.entities.Paises;
import com.bl.logic.AppController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class vecinosController implements Initializable {

    private AppController pControlador = new AppController();

    @FXML
    private Button btnMenuRuta;

    @FXML
    private Button btnMenuDestino;

    @FXML
    private Button btnMenuVecinos;

    @FXML
    private ChoiceBox<String> cboxPaisVecinos;

    @FXML
    private Button btnBuscar;

    @FXML
    private TableView<Paises> tblPaises;

    @FXML
    private TableColumn colNom;

    private ObservableList<Paises> pa;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        pa = FXCollections.observableArrayList();

        this.colNom.setCellValueFactory(new PropertyValueFactory("nombres"));

        loadData();
    }

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

    @FXML
    void OnBuscarVecinosClicked(MouseEvent event) {

        ArrayList<String> vecinos = pControlador.buscarVecinos(cboxPaisVecinos.getValue());
        mostrarVecinos(vecinos);
    }

    private void loadData(){

        cboxPaisVecinos.getItems().addAll(pControlador.nombres);
    }

    public void mostrarVecinos(ArrayList<String> listaPaises) {

        for (int i = 0; i < listaPaises.size(); i++) {

            Paises p = new Paises(listaPaises.get(i));
            this.pa.add(p);
            this.tblPaises.setItems(pa);

            //System.out.println(listaPaises.get(i));
        }
    }

}
