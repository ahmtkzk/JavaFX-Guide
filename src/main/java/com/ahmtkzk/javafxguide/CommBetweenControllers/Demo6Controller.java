package com.ahmtkzk.javafxguide.CommBetweenControllers;

import com.ahmtkzk.javafxguide.HelloController2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Demo6Controller {

    @FXML
    TextField textBox;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException {

        //Bilgileri yollama kısmı.
        String kadi = textBox.getText();

        //Yeni scene bağladık.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("demo6_second.fxml"));
        root = loader.load();

        HelloController2 helloController2 = loader.getController();
        helloController2.goster(kadi);

        //Yeni sayfaya geçme kısmı.
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
