module com.main.printers_map {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.printers_map to javafx.fxml;
    exports com.main.printers_map;
}