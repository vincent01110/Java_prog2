module com.example.com_between_scenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.com_between_scenes to javafx.fxml;
    exports com.example.com_between_scenes;
}