package com.example.imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;
    private int i = 1;

    Image myImage0 = new Image(getClass().getResourceAsStream("astr.png"));
    Image myImage1 = new Image(getClass().getResourceAsStream("moonlight.jpg"));
    Image myImage2 = new Image(getClass().getResourceAsStream("mountain.jpg"));
    Image[] images = {myImage0, myImage1, myImage2};

    public void displayImage(){
        myImageView.setImage(images[i]);
        i++;
        if (i >= images.length) i = 0;
    }
}