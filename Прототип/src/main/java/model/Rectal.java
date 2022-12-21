package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectal extends Shapes {
    double length;
    double height;

    public void Draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setFill(ShapeColor);
        gc.fillRect(pointX, pointY, length, height);
    }

    public double perimeter(){
        return (2 * (length + height));
    }

    public String toString() {
        return "Квадрат ";
    }

    public Rectal(Color color, double length, double height) {
// calling Shape constructor
        super(color);
        this.length = length;
        this.height = height;
    }
}
