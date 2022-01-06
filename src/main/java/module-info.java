module com.example.automotores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.automotores to javafx.fxml;
    exports com.example.automotores;
}