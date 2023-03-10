package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends  Shapes{
    double x1;
    double x2;
    double y1;
    double y2;
    double x3;
    double y3;
    public void Draw(GraphicsContext gc, Double pointX, Double pointY) {

        gc.setStroke(ShapeColor);
        gc.strokeLine(x1+pointX, y1+pointY, x2+pointX, y2+pointY);
        gc.strokeLine(x1+pointX, y1+pointY, x3+pointX, y3+pointY);
        gc.strokeLine(x2+pointX, y2+pointY, x3+pointX, y3+pointY);

    }

    public double perimeter(){

        double a = Math.sqrt(Math.pow((x1 - x2),2)+Math.pow((y1 - y2),2));
        double b = Math.sqrt(Math.pow((x1 - x3),2)+Math.pow((y1 - y3),2));
        double c = Math.sqrt(Math.pow((x2 - x3),2)+Math.pow((y2 - y3),2));
        return (a + b + c);

    }

    public String toString() {
        return "Треугольник";
    }

    public Triangle(Color color, double x1, double y1, double x2, double y2, double x3, double y3 ) {
// calling Shape constructor
        super(color);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
}
