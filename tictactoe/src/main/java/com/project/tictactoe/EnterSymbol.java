package com.project.tictactoe;


import javafx.scene.control.Toggle;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

import static com.project.tictactoe.FencingFloorGrid.stackPaneHashMap;
import static com.project.tictactoe.StartMenu.circleRadio;

public interface EnterSymbol {

    double lineWidth = 5;

    static void putCross(StackPane sp) {
        Line line1 = new Line(1, 1, 50, 50);
        Line line2 = new Line(1, 50, 50, 1);
        line1.setStrokeWidth(lineWidth);
        line2.setStrokeWidth(lineWidth);
        Shape cross = Shape.union(line1, line2);
        sp.getChildren().add(cross);
        stackPaneHashMap.put(sp, Symbol.CROSS.number);
    }

    static void putCircle(StackPane sp) {

        Ellipse circle = new Ellipse(10, 10, 30, 30);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(lineWidth);
        sp.getChildren().add(circle);
        stackPaneHashMap.put(sp, Symbol.CIRCLE.number);
    }

    static void drawComputerSymbol(Toggle toggle) {
        ArrayList<StackPane> list = new ArrayList<>();
        for (Map.Entry<StackPane, Integer> entry : stackPaneHashMap.entrySet()) {
            if (Objects.equals(entry.getValue(), Symbol.EMPTY.number)) {
                list.add(entry.getKey());
            }
        }
        Random random = new Random();
        int index = random.nextInt(list.size());

        if (!toggle.equals(circleRadio)) {
            EnterSymbol.putCircle(list.get(index));
        } else {
            EnterSymbol.putCross(list.get(index));
        }
    }
}
