module com.programandofodacci.explobric {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    requires atlantafx.base;
    requires com.google.gson;
    requires com.google.zxing;
    requires fr.brouillard.oss.cssfx;
    requires org.postgresql.jdbc;
    requires org.fxmisc.undo;
    requires com.dlsc.preferencesfx;
    
    requires jfxtras.controls;
    requires jfxtras.fxml;
    
    requires org.controlsfx.controls;
    requires com.dlsc.keyboardfx;

    opens com.programandofodacci.explobric to javafx.fxml, jfxtras.fxml;
    exports com.programandofodacci.explobric;
}
