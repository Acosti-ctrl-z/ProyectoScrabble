module com.example.demousuario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.desktop;
    requires json.simple;

    opens Controllers to javafx.fxml;
    exports Controllers;
    exports Modelo;
    opens Modelo to javafx.fxml;
    exports Command;
    opens Command to javafx.fxml;
}