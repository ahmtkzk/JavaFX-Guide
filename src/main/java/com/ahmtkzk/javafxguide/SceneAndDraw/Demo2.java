package com.ahmtkzk.javafxguide.SceneAndDraw;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Demo2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.BEIGE);
        Stage stage1 = new Stage();

        //Yazı yazmayı sağlar ve özellik verir.
        Text text = new Text();
        text.setText("Whoooooaaa!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.GREEN);

        //Herhangi bir çizgi çekme işlemi.
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);


        root.getChildren().add(text);
        root.getChildren().add(line);
        stage1.setScene(scene);
        stage1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
