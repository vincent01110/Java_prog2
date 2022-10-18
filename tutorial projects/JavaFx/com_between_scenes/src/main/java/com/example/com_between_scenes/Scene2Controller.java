package com.example.com_between_scenes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {

    @FXML
    Label nameLabel;


    public void displayName(String username, String password) {
        nameLabel.setText("Hello:" + username);
        if (!password.equals(null)){
            System.out.println("password=" + password);
        }
    }
}
