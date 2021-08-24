package com.project.tictactoe;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import static com.project.tictactoe.FencingFloorGrid.getFencingFloorGrid;
import static com.project.tictactoe.SummaryGrid.getSummaryGrid;

public class MainScene {

    public static Scene buildMainScene() {

        GridPane mainGrid = new GridPane();
        mainGrid.setAlignment(Pos.CENTER);
        mainGrid.add(getFencingFloorGrid(),1,2);
        mainGrid.add(getSummaryGrid(),1,1);
        Scene mainScene = new Scene(mainGrid,600,600, Color.WHITE);
        return mainScene;
    }
}
