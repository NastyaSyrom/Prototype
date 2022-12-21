package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shapes {
    double x1;
    double y1;
    double x2;
    double y2;

    public void Draw(GraphicsContext gc) {
        gc.setStroke(ShapeColor);
        gc.strokeLine(x1, y1, x2, y2);
    }

    public double perimeter(){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }

    public String toString() {
        return "Цвет линии " + super.ShapeColor + ", а длина линии равна: " + perimeter();
    }

    public Line(Color color, double x1, double y1, double x2, double y2) {
// calling Shape constructor
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

}
