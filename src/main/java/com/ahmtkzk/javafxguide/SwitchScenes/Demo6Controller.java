package com.ahmtkzk.javafxguide.SwitchScenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Demo6Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void degistirBirinci(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("demo5_second.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void degistirIkinci(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("demo5_first.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
