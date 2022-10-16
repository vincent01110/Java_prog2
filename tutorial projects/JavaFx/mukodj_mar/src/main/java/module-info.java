module com.example.mukodj_mar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mukodj_mar to javafx.fxml;
    exports com.example.mukodj_mar;
}