package com.ahmtkzk.javafxguide.CommBetweenControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Demo6Controller2 {

    @FXML
    Label label;

    public void goster(String isim) {
        label.setText("Hoşgeldin " + isim);
    }

}
