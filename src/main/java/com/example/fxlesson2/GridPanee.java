package com.example.fxlesson2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;

public class GridPanee extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label first = new Label("First");
        Label second = new Label("Second");
        Label third = new Label("Third");

        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(80));
        root.getColumnConstraints().add(new ColumnConstraints(150));
        root.getColumnConstraints().add(new ColumnConstraints(70));

        root.setGridLinesVisible(true); // делаем видимой сетку строк и столбцов
        root.setColumnIndex(first, 0);
        root.setColumnIndex(second, 1);
        root.setColumnIndex(third, 2);
        root.getChildren().addAll(first, second, third);


        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("GridPane in JavaFX");

        stage.show();
    }
}