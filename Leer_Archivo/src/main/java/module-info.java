module com.example.leer_archivo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.leer_archivo to javafx.fxml;
    exports com.example.leer_archivo;
}