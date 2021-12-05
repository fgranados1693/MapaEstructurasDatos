package com.ui.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class app extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
        primaryStage.setTitle("Estructuras de Datos 2");
        primaryStage.setScene(new Scene(root,1052, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
