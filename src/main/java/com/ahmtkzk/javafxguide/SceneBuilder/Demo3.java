package com.ahmtkzk.javafxguide.SceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * Scene builder ile bir tasarım yapmak için, Group ile bir root açmak yerine,
 * Parent ile bir root oluşturulur ve xml dosyası seçilir.
 * Bu dosya Scene ile bağlanır.
 */
public class Demo3 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Path"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
