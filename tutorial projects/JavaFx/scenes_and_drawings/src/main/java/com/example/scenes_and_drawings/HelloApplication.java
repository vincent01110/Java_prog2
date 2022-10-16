package com.example.scenes_and_drawings;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.OLIVE);

        Text text = new Text();
        text.setText("¡Hola, Mi Amigo! ¿Cómo estás?");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdena", 30));
        text.setFill(Color.YELLOW);

        root.getChildren().add(text);

        stage.setTitle("Program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}