package com.exampleLABA2_1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


import javafx.util.Callback;
import model.*;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    public ColorPicker picker;
    public TextField textF;
    public ListView list;
    @FXML
    private Canvas my_canvas;
    @FXML
    private GraphicsContext gc;
    Shapes sp = new Rectal(Color.BLUE, 200, 200);
    //ShapeFactor sf = new ShapeFactor();

    private ObservableList<Shapes> content;


  /*  public Shapes getShape(int i){
        if (i == 1){
            return new Line(Color.BLACK, 100.0, 30, 250, 30);
        }
        else if (i == 2){
            return new Rectal(Color.PURPLE, 250, 200);
        }
        else if (i == 3){
            return new Triangle(Color.RED, 0, 0, 200, 170, 300, 170 );
        }
        else if (i == 4){
            return new Circle(Color.AQUA, 70, 200);
        }
        return new Rectal(Color.PURPLE, 250, 200);
    }
*/

  /*  public void pressF(KeyEvent keyEvent) {

        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight());

        if(!textF.getText().equals("") ){
            sp = getShape(Integer.parseInt(textF.getText()));
            sp.setShapeColor(picker.getValue());
            sp.Draw(gc);
        }
    }*/
      public void drawShape(MouseEvent mouseEvent) {
          int index = list.getSelectionModel().getSelectedIndex(); //получение индекса выбора из списка

          Shapes shapes = (Shapes) content.get(index).clone();// создание копии фигуры

          shapes.setShapeColor(picker.getValue()); // установка цвета заполнения фигуры по значению элемента управления colorPicker


           shapes.Draw(gc, mouseEvent.getX(), mouseEvent.getY());
      }
    public void initialize(URL location, ResourceBundle resources) {
        gc = my_canvas.getGraphicsContext2D();
        Line line = new Line(Color.BLACK, 50.0, 30, 70, 30);

        Rectal rectangle = new Rectal(Color.PURPLE, 80, 80);

        Circle circle = new Circle(Color.AQUA, 100, 70);

        Triangle triangle = new Triangle(Color.RED, 40, 10, 0, 60, 80, 60);
        Gone gone = new Gone(Color.RED, 100, 50);

        content = FXCollections.observableArrayList(circle, line, rectangle, triangle, gone);


        list.setItems(content);
        list.setCellFactory(new Callback<ListView<Shapes>, ListCell<Shapes>>() {
            @Override
            public ListCell<Shapes> call(ListView<Shapes> list) {
                return new ShapeCell();
            }
        });
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
    public void clearingCanvas(ActionEvent actionEvent) {
        GraphicsContext gr = my_canvas.getGraphicsContext2D();
        gr.clearRect(0, 0, 700, 700);
    }
}