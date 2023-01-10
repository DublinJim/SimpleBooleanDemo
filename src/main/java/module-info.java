module com.example.simplebooleandemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simplebooleandemo to javafx.fxml;
    exports com.example.simplebooleandemo;
}