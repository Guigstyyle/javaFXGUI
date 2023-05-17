module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
    exports com.example.partie1;
    exports com.example.partie2;
    exports com.example.partie3;
    opens com.example.partie3 to javafx.fxml;
}