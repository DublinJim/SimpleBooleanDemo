package com.example.simplebooleandemo;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public AnchorPane rootPane;
    public CheckBox chk1;
    public Text txt1;
    private SimpleBooleanProperty simpleBooleanProperty = new SimpleBooleanProperty();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        simpleBooleanProperty.addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                setNewText();
            }
        });

        System.out.println("Before checking checkbox " + simpleBooleanProperty);
        txt1.setText("After the check " + simpleBooleanProperty.getValue());
        if (chk1.isSelected()) {
            simpleBooleanProperty.setValue(chk1.isSelected());
        }

        txt1.setText("After the check " + simpleBooleanProperty.getValue());


    }

    public void setNewText() {
        txt1.setText(simpleBooleanProperty.toString());
    }

    public void checkBoxHandler(ActionEvent actionEvent) {
        simpleBooleanProperty.setValue(chk1.isSelected());

    }
}
