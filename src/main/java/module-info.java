module com.programandofodacci.explobric {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.programandofodacci.explobric to javafx.fxml;
    exports com.programandofodacci.explobric;
}
