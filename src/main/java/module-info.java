module com.ahmtkzk.javafxguide {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.ahmtkzk.javafxguide to javafx.fxml;
    exports com.ahmtkzk.javafxguide;
}