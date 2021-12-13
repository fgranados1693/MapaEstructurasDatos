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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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

        ArrayList<String> listaPaises = pControlador.buscarVecinos(cboxPaisVecinos.getValue());
        mostrarVecinos(listaPaises);
        desplegarVecinos(listaPaises);
    }

    private void loadData() {

        cboxPaisVecinos.getItems().addAll(pControlador.nombres);
    }

    public void mostrarVecinos(ArrayList<String> listaPaises) {

        limpiarBusqueda();
        tblPaises.getItems().clear();

        for (int i = 0; i < listaPaises.size(); i++) {

            Paises p = new Paises(listaPaises.get(i));
            this.pa.add(p);
            this.tblPaises.setItems(pa);

            //System.out.println(listaPaises.get(i));
        }
    }

    public void limpiarBusqueda() {

        String colorNormal = "#dea135";
        double radio = 7;
        Boolean status = true;

        dot0.setVisible(status);
        dot0.setFill(Color.web(colorNormal));
        dot0.setRadius(radio);
        dot1.setVisible(status);
        dot1.setFill(Color.web(colorNormal));
        dot1.setRadius(radio);
        dot2.setVisible(status);
        dot2.setFill(Color.web(colorNormal));
        dot2.setRadius(radio);
        dot3.setVisible(status);
        dot3.setFill(Color.web(colorNormal));
        dot3.setRadius(radio);
        dot4.setVisible(status);
        dot4.setFill(Color.web(colorNormal));
        dot4.setRadius(radio);
        dot5.setVisible(status);
        dot5.setFill(Color.web(colorNormal));
        dot5.setRadius(radio);
        dot6.setVisible(status);
        dot6.setFill(Color.web(colorNormal));
        dot6.setRadius(radio);
        dot7.setVisible(status);
        dot7.setFill(Color.web(colorNormal));
        dot7.setRadius(radio);
        dot8.setVisible(status);
        dot8.setFill(Color.web(colorNormal));
        dot8.setRadius(radio);
        dot9.setVisible(status);
        dot9.setFill(Color.web(colorNormal));
        dot9.setRadius(radio);
        dot10.setVisible(status);
        dot10.setFill(Color.web(colorNormal));
        dot10.setRadius(radio);
        dot11.setVisible(status);
        dot11.setFill(Color.web(colorNormal));
        dot11.setRadius(radio);
        dot12.setVisible(status);
        dot12.setFill(Color.web(colorNormal));
        dot12.setRadius(radio);
        dot13.setVisible(status);
        dot13.setFill(Color.web(colorNormal));
        dot13.setRadius(radio);
        dot14.setVisible(status);
        dot14.setFill(Color.web(colorNormal));
        dot14.setRadius(radio);
        dot15.setVisible(status);
        dot15.setFill(Color.web(colorNormal));
        dot15.setRadius(radio);
        dot16.setVisible(status);
        dot16.setFill(Color.web(colorNormal));
        dot16.setRadius(radio);
        dot17.setVisible(status);
        dot17.setFill(Color.web(colorNormal));
        dot17.setRadius(radio);
        dot18.setVisible(status);
        dot18.setFill(Color.web(colorNormal));
        dot18.setRadius(radio);
        dot19.setVisible(status);
        dot19.setFill(Color.web(colorNormal));
        dot19.setRadius(radio);
        dot20.setVisible(status);
        dot20.setFill(Color.web(colorNormal));
        dot20.setRadius(radio);
        dot21.setVisible(status);
        dot21.setFill(Color.web(colorNormal));
        dot21.setRadius(radio);
        dot22.setVisible(status);
        dot22.setFill(Color.web(colorNormal));
        dot22.setRadius(radio);
        dot23.setVisible(status);
        dot23.setFill(Color.web(colorNormal));
        dot23.setRadius(radio);
        dot24.setVisible(status);
        dot24.setFill(Color.web(colorNormal));
        dot24.setRadius(radio);
    }

    public void desplegarVecinos(ArrayList<String> listaPaises) {

        String colorVecino = "#EB5757";

        double radio = 10;
        Boolean status = true;
        int cont = 0;

        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(pControlador.convertirString(cboxPaisVecinos.getValue()));

        for (int i = 0; i < listaPaises.size(); i++) {
            indices.add(pControlador.convertirString(listaPaises.get(i)));
        }

        if (cont == 0) {
            for (int i = 0; i < indices.size(); i++) {

                if (indices.get(i) == 0) {
                    dot0.setVisible(status);
                    dot0.setFill(Color.web(colorVecino));
                    dot0.setRadius(radio);

                } else if (indices.get(i) == 1) {
                    dot1.setVisible(status);
                    dot1.setFill(Color.web(colorVecino));
                    dot1.setRadius(radio);
                } else if (indices.get(i) == 2) {
                    dot2.setVisible(status);
                    dot2.setFill(Color.web(colorVecino));
                    dot2.setRadius(radio);
                } else if (indices.get(i) == 3) {
                    dot3.setVisible(status);
                    dot3.setFill(Color.web(colorVecino));
                    dot3.setRadius(radio);
                } else if (indices.get(i) == 4) {
                    dot4.setVisible(status);
                    dot4.setFill(Color.web(colorVecino));
                    dot4.setRadius(radio);
                } else if (indices.get(i) == 5) {
                    dot5.setVisible(status);
                    dot5.setFill(Color.web(colorVecino));
                    dot5.setRadius(radio);
                } else if (indices.get(i) == 6) {
                    dot6.setVisible(status);
                    dot6.setFill(Color.web(colorVecino));
                    dot6.setRadius(radio);
                } else if (indices.get(i) == 7) {
                    dot7.setVisible(status);
                    dot7.setFill(Color.web(colorVecino));
                    dot7.setRadius(radio);
                } else if (indices.get(i) == 8) {
                    dot8.setVisible(status);
                    dot8.setFill(Color.web(colorVecino));
                    dot8.setRadius(radio);
                } else if (indices.get(i) == 9) {
                    dot9.setVisible(status);
                    dot9.setFill(Color.web(colorVecino));
                    dot9.setRadius(radio);
                } else if (indices.get(i) == 10) {
                    dot10.setVisible(status);
                    dot10.setFill(Color.web(colorVecino));
                    dot10.setRadius(radio);
                } else if (indices.get(i) == 11) {
                    dot11.setVisible(status);
                    dot11.setFill(Color.web(colorVecino));
                    dot11.setRadius(radio);
                } else if (indices.get(i) == 12) {
                    dot12.setVisible(status);
                    dot12.setFill(Color.web(colorVecino));
                    dot12.setRadius(radio);
                } else if (indices.get(i) == 13) {
                    dot13.setVisible(status);
                    dot13.setFill(Color.web(colorVecino));
                    dot13.setRadius(radio);
                } else if (indices.get(i) == 14) {
                    dot14.setVisible(status);
                    dot14.setFill(Color.web(colorVecino));
                    dot14.setRadius(radio);
                } else if (indices.get(i) == 15) {
                    dot15.setVisible(status);
                    dot15.setFill(Color.web(colorVecino));
                    dot15.setRadius(radio);
                } else if (indices.get(i) == 16) {
                    dot16.setVisible(status);
                    dot16.setFill(Color.web(colorVecino));
                    dot16.setRadius(radio);
                } else if (indices.get(i) == 17) {
                    dot17.setVisible(status);
                    dot17.setFill(Color.web(colorVecino));
                    dot17.setRadius(radio);
                } else if (indices.get(i) == 18) {
                    dot18.setVisible(status);
                    dot18.setFill(Color.web(colorVecino));
                    dot18.setRadius(radio);
                } else if (indices.get(i) == 19) {
                    dot19.setVisible(status);
                    dot19.setFill(Color.web(colorVecino));
                    dot19.setRadius(radio);
                } else if (indices.get(i) == 20) {
                    dot20.setVisible(status);
                    dot20.setFill(Color.web(colorVecino));
                    dot20.setRadius(radio);
                } else if (indices.get(i) == 21) {
                    dot21.setVisible(status);
                    dot21.setFill(Color.web(colorVecino));
                    dot21.setRadius(radio);
                } else if (indices.get(i) == 22) {
                    dot22.setVisible(status);
                    dot22.setFill(Color.web(colorVecino));
                    dot22.setRadius(radio);
                } else if (indices.get(i) == 23) {
                    dot23.setVisible(status);
                    dot23.setFill(Color.web(colorVecino));
                    dot23.setRadius(radio);
                } else if (indices.get(i) == 24) {
                    dot24.setVisible(status);
                    dot24.setFill(Color.web(colorVecino));
                    dot24.setRadius(radio);
                }
            }

        }
    }

}
