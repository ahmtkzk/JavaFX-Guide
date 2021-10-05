package com.ahmtkzk.javafxguide.Stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
 * Stage -> Scene -> Scene Graph
 * Sıralama bu şekilde gider.
 * Ana Class mutlaka Application'dan extend edilmelidir.
 * main methoduna launch(args); methodu eklenir.
 */

public class Demo1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BEIGE);

        stage.setTitle("Burası başlığı belirler.");
        stage.setWidth(500); //Genişlik değeri.
        stage.setHeight(500); //Yükseklik değeri.
        stage.setResizable(false); //Özgür boyutlandırmayı açıp kapatma.
        stage.setFullScreenExitHint("Tam ekrandan çıkma mesajını belirler.");
        stage.setFullScreen(false); //Tam ekran olup olmamasını belirler.

        stage.setScene(scene);
        stage.show();
    }
}
