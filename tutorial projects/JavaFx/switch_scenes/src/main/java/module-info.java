module com.example.switch_scenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.switch_scenes to javafx.fxml;
    exports com.example.switch_scenes;
}