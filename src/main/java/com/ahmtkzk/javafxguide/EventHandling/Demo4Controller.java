package com.ahmtkzk.javafxguide.EventHandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

/*
 * Control sınıfını eklemek için SceneBuilder kısmında sol tarafta "Controller" kısmından
 * kontolcü sınıfı seçilir.
 *
 * Bir Method oluşturulur ve ActionEvenet e parametresi verilir ve Scene Builder içerisinden
 * komponente sağ taraftaki kod kısmından On Action kısmına method ismi verilir.
 */
public class Demo4Controller {

    @FXML
    private Circle myCircle;
    private double X;
    private double Y;

    public void up(ActionEvent e) {
        myCircle.setCenterY(Y = Y - 5);
    }

    public void down(ActionEvent e) {
        myCircle.setCenterY(Y = Y + 5);
    }

    public void left(ActionEvent e) {
        myCircle.setCenterX(X = X - 5);
    }

    public void right(ActionEvent e) {
        myCircle.setCenterX(X = X + 5);
    }
}
