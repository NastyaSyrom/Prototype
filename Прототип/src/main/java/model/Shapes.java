package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shapes implements Cloneable{
    protected Color ShapeColor;

    public abstract String toString();

    public abstract void Draw(GraphicsContext gc, Double pointX, Double pointY);

    // public abstract double perimeter();

    public Shapes(Color color) {
        System.out.println("Shape constructor called");
        this.ShapeColor = color;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();   }
        return clone; }

   /* public Color getShapeColor() {
        return ShapeColor;
    }*/

    public void setShapeColor(Color shapeColor) {
        ShapeColor = shapeColor;
    }
}

