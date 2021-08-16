package com.project.tictactoe;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.util.HashMap;
import java.util.Map;

import static com.project.tictactoe.Controller.clickOnBox;

public class FencingFloorGrid {

    private FencingFloorGrid() {
    }

    public static HashMap<StackPane, Integer> stackPaneHashMap = new HashMap<StackPane, Integer>();

    final static Image field1 = new Image("file:src/main/resources/field1.png", 120, 120, true, false);
    final static Image field2 = new Image("file:src/main/resources/field2.png", 120, 120, true, false);
    final static Image field3 = new Image("file:src/main/resources/field3.png", 120, 120, true, false);
    final static Image field4 = new Image("file:src/main/resources/field4.png", 120, 120, true, false);
    final static Image field5 = new Image("file:src/main/resources/field5.png", 120, 120, true, false);
    final static Image field6 = new Image("file:src/main/resources/field6.png", 120, 120, true, false);
    final static Image field7 = new Image("file:src/main/resources/field7.png", 120, 120, true, false);
    final static Image field8 = new Image("file:src/main/resources/field8.png", 120, 120, true, false);
    final static Image field9 = new Image("file:src/main/resources/field9.png", 120, 120, true, false);

    static StackPane stackPane1 = new StackPane(new ImageView(field1));
    static StackPane stackPane2 = new StackPane(new ImageView(field2));
    static StackPane stackPane3 = new StackPane(new ImageView(field3));
    static StackPane stackPane4 = new StackPane(new ImageView(field4));
    static StackPane stackPane5 = new StackPane(new ImageView(field5));
    static StackPane stackPane6 = new StackPane(new ImageView(field6));
    static StackPane stackPane7 = new StackPane(new ImageView(field7));
    static StackPane stackPane8 = new StackPane(new ImageView(field8));
    static StackPane stackPane9 = new StackPane(new ImageView(field9));



    static {

        stackPaneHashMap.put(stackPane1, Symbol.EMPTY.number);
        stackPaneHashMap.put(stackPane2, Symbol.EMPTY.number);
        stackPaneHashMap.put(stackPane3, Symbol.EMPTY.number);
        stackPaneHashMap.put(stackPane4, Symbol.EMPTY.number);
        stackPaneHashMap.put(stackPane5, Symbol.EMPTY.number);
        stackPaneHashMap.put(stackPane6, Symbol.EMPTY.number);
        stackPaneHashMap.put(stackPane7, Symbol.EMPTY.number);
        stackPaneHashMap.put(stackPane8, Symbol.EMPTY.number);
        stackPaneHashMap.put(stackPane9, Symbol.EMPTY.number);

        for (Map.Entry<StackPane, Integer> entry : stackPaneHashMap.entrySet()) {
            entry.getKey().addEventHandler(MouseEvent.MOUSE_CLICKED, clickOnBox);
        }
    }

    public static GridPane getFencingFloorGrid() {
        Image image = new Image("file:src/main/resources/background.png");

        BackgroundSize backgroundSize = new BackgroundSize(700, 700, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(32, 100, 63, 70));
        grid.setHgap(20);
        grid.setVgap(18);

        grid.add(stackPane1, 1, 1);
        grid.add(stackPane2, 2, 1);
        grid.add(stackPane3, 3, 1);
        grid.add(stackPane4, 1, 2);
        grid.add(stackPane5, 2, 2);
        grid.add(stackPane6, 3, 2);
        grid.add(stackPane7, 1, 3);
        grid.add(stackPane8, 2, 3);
        grid.add(stackPane9, 3, 3);

        return grid;
    }

}
