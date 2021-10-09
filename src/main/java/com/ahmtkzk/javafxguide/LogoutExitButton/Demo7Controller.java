package com.ahmtkzk.javafxguide.LogoutExitButton;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Demo7Controller {
    @FXML
    private AnchorPane pane;

    Stage stage;

    public void cikis() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Çıkış");
        alert.setHeaderText("Çıkış yapmak üzeresiniz!");
        alert.setContentText("Çıkış yapmak istiyor musunuz?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) pane.getScene().getWindow();
            System.out.printf("Çıkış yapıldı.");
            stage.close();
        }
    }
}
