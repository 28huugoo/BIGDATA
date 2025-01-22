module com.example.buenofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buenofx to javafx.fxml;
    exports com.example.buenofx;
}