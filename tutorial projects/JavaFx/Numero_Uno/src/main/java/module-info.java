module com.example.numero_uno {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numero_uno to javafx.fxml;
    exports com.example.numero_uno;
}