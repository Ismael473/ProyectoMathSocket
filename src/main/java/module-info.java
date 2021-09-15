module com.example.proyectomathsocket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectomathsocket to javafx.fxml;
    exports com.example.proyectomathsocket;
}