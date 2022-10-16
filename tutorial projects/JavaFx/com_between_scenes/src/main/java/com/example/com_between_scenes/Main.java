package com.example.com_between_scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            String css = this.getClass().getResource("style.css").toExternalForm();
            scene.getStylesheets().add(css);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}