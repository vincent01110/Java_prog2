module com.css_styling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.css_styling to javafx.fxml;
    exports com.css_styling;
}