package com.main.printers_map;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PopupController {

    @FXML
    public TextField nameField;
    @FXML
    public TextField areaField;
    @FXML
    public TextField tonerField;

    private File listFile = new File("src/main/resources/com/main/printers_map/printers.txt");
    private String filePath = "src/main/resources/com/main/printers_map/printers.txt";

    public Printer newPrinter(){
        return new Printer(nameField.getText(), areaField.getText(), tonerField.getText());
    }

}
