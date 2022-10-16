module com.sample_proj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sample_proj to javafx.fxml;
    exports com.sample_proj;
}