package com.exampleLABA2_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.Circle;
import model.Line;
import model.Rectagle;
import model.Triangle;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private Canvas my_canvas;
    @FXML
    private GraphicsContext gc;

    @FXML
    public void onLineClick1(ActionEvent event) {
        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight());

        Line line = new Line(Color.BLACK, 100.0, 30, 250, 30);
        line.Draw(gc);
        System.out.println(line.toString());
    }

    @FXML
    public void onRectClick1(ActionEvent event) {
        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight());

        Rectagle rect = new Rectagle(Color.PURPLE, 250, 200);
        rect.Draw(gc);
        System.out.println(rect.toString());
    }

    @FXML
    public void onTriagleClick1(ActionEvent event) {
        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight());

        Triangle tr = new Triangle(Color.RED, 0, 0, 200, 170, 300, 170 );
        tr.Draw(gc);
        System.out.println(tr.toString());
    }
    @FXML
    public void onCircleClick1(ActionEvent actionEvent) {
        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight());

        Circle cr = new Circle(Color.AQUA, 70, 200);
        cr.Draw(gc);
        System.out.println(cr.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = my_canvas.getGraphicsContext2D();
    }


}