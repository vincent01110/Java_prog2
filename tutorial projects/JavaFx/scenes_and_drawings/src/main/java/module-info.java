module com.example.scenes_and_drawings {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenes_and_drawings to javafx.fxml;
    exports com.example.scenes_and_drawings;
}