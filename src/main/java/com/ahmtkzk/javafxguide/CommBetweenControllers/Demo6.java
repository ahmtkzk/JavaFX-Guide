package com.ahmtkzk.javafxguide.CommBetweenControllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Demo6 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("demo6_first.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }


}
