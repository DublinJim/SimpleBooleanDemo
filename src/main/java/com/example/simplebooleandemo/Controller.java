package com.example.simplebooleandemo;

import javafx.beans.property.SimpleBooleanProperty;
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
        System.out.println("Before checking checkbox "+simpleBooleanProperty);
        if (chk1.isSelected()) {
            simpleBooleanProperty.setValue(chk1.isSelected());
        }
        System.out.println("After the check " + simpleBooleanProperty);
    }


}
