package com.ahmtkzk.javafxguide.Slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Demo8Controller implements Initializable {

    @FXML
    Label label1;
    @FXML
    Slider slider1;

    int sicaklik;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        slider1.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                sicaklik = (int) slider1.getValue();
                label1.setText(Integer.toString(sicaklik));
            }
        });
    }
}
