module com.example.fxlesson2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxlesson2 to javafx.fxml;
    exports com.example.fxlesson2;
}