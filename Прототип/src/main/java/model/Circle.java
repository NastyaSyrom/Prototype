package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shapes{
    double x1;
    double x2;
    double radius;



    public void Draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setFill(ShapeColor);
        gc.fillOval(pointX, pointY, x2, x2);
    }

    public double perimeter(){
        radius = x2/2;
        return 2 * Math.PI * radius;
    }

  public String toString() {
        return "Круг " ;
    }

    public Circle(Color color, double x1, double x2) {
// calling Shape constructor
        super(color);
        this.x1 = x1;
        this.x2 = x2;
        //this.height = height;
    }
}
