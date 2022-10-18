module com.example.logout_exit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.logout_exit to javafx.fxml;
    exports com.example.logout_exit;
}