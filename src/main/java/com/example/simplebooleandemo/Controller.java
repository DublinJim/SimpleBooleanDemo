package com.example.simplebooleandemo;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private final SimpleBooleanProperty simpleBooleanProperty = new SimpleBooleanProperty();
    public AnchorPane rootPane;
    public CheckBox chk1;
    public Text txt1;
    public ImageView imageView;
    private Image image1;
    private Image image2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        /* simpleBooleanProperty.addListener((observableValue, aBoolean, t1) -> setNewText());*/
        simpleBooleanProperty.addListener((observable -> setNewText()));

        System.out.println("Before checking checkbox " + simpleBooleanProperty);
        txt1.setText("After the check " + simpleBooleanProperty.getValue());
        if (chk1.isSelected()) {
            simpleBooleanProperty.setValue(chk1.isSelected());
        }

        txt1.setText("After the check " + simpleBooleanProperty.getValue());


        image1 = new Image("C:\\Users\\james.keogh\\IdeaProjects\\proto\\SimpleBooleanDemo\\src\\main\\resources\\Images\\coin-teaser-v2.jpg");
        image2 = new Image("C:\\Users\\james.keogh\\IdeaProjects\\proto\\SimpleBooleanDemo\\src\\main\\resources\\Images\\Royal_Canadian_Mint_The_Royal_Canadian_Mint_Launches_its_Largest.jpg");

    }

    public void setNewText() {
        txt1.setText(simpleBooleanProperty.toString());
    }

    public void checkBoxHandler() {
        if (chk1.isSelected()) {
            simpleBooleanProperty.setValue(chk1.isSelected());
            imageView.setImage(image1);
        }
        else {
            imageView.setImage(image2);
        }

    }
}
