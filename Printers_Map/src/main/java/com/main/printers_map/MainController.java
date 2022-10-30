package com.main.printers_map;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;


public class MainController implements Initializable {
    @FXML
    private ListView<String> listView;
    @FXML
    private Button addButton;


    private int deleteIndex = -1;
    public List<Printer> readList() throws FileNotFoundException {
        List<Printer> printerList = new ArrayList<>();
        File listFile = new File("src/main/resources/com/main/printers_map/printers.txt");
        Scanner scanner = new Scanner(listFile);
        while(scanner.hasNextLine()){
            String[] split = scanner.nextLine().split(";");
            if (split.length == 3) {
                printerList.add(new Printer(split[0], split[1], split[2]));
            } else {
                System.out.println("Nincs elég argumentum basszam ki");
            }
        }
        return printerList;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            for(var e : readList()){
                listView.getItems().add(e.getName());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteItem() throws NoItemSelected{
        deleteIndex = listView.getSelectionModel().getSelectedIndex();
        String deleteName = listView.getSelectionModel().getSelectedItem();
        if (deleteName.equals(null)){

        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Do you want to delete " + deleteName + "?");
            alert.showAndWait();
            if (deleteIndex != -1 && alert.getResult() == ButtonType.OK) {
                listView.getItems().remove(deleteIndex);
            }
        }

    }


    public void addItem(String name, String area, String toner) throws IOException, URISyntaxException {
        /**FXMLLoader loader = new FXMLLoader(getClass().getResource("popup.fxml"));
        PopupController popupController = loader.getController();
        Printer temp = popupController.newPrinter();
        listView.getItems().add(temp.getName());
        File listFile = new File("src/main/resources/com/main/printers_map/printers.txt");
        FileWriter fileWriter = new FileWriter(listFile,true);
        String text = "\n" + temp.getName() + ";" + temp.getArea() + ";" + temp.getToner();
        fileWriter.write(text);
        fileWriter.close();

        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage popup = new Stage();
        popup.initModality(Modality.APPLICATION_MODAL);
        popup.setScene(scene);
        popup.show();*/
    }


    public void editItem(){
        //TODO
    }
}