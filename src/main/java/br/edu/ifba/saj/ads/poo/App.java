package br.edu.ifba.saj.ads.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.Load(getClass().getResource("primary.fxml"));
        prymaryStage.setTitle ();
    }

    public static void main(String[] args) {
        launch(args);
    }

}