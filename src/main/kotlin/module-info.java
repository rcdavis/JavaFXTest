module com.example.javafxtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;

    opens com.example.javafxtest to javafx.fxml;
    exports com.example.javafxtest;
}