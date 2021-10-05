package com.ahmtkzk.javafxguide.CSS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
* Sahnemizi css ile şekillendirebiliriz. Bunun için bir css dosyası oluşturup onu bağlamamız yeterli.
* Bağlamak için gerekli kodlar aşağıda bulunuyor.
* ID verip gerisini css ile yapmak mümkün. başına -fx- etiketleri geliyor css kodlarının.
*/
public class Demo5 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("demo5.fxml"));
        Scene scene = new Scene(root);

        String css = this.getClass().getResource("demo5.css").toExternalForm();
        scene.getStylesheets().add(css);
        //scene.getStylesheets().add(getClass().getResource("demo5.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }
}
