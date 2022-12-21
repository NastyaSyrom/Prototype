package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Gone extends Shapes{
    double CanvasHeight;
    double CanvasWidth;
    double Radius = 40;


    public void Draw(GraphicsContext gc, Double pointX, Double pointY) {

        gc.setFill(ShapeColor);

        double[] x_cords = new double[5];
        double[] y_cords = new double[5];

        for (int i = 0; i < 5; ++i) {
            x_cords[i] = (Radius * Math.cos(2 * Math.PI * i / 5) + (((CanvasWidth/5) + 90) / 2)) + pointX;
            y_cords[i] = (Radius * Math.sin(2 * Math.PI * i / 5) + (((CanvasHeight/5) + 60) / 2)) + pointY;
        }
        gc.fillPolygon(x_cords, y_cords, x_cords.length);



    }

    public double area(){
        return 0.5 * Math.pow(Radius,2) * 5 * Math.sin(360.0/5) ;
    }

    public String toString() {
        return "Пятиугольник";
    }

    public Gone(Color color, double CanvasHeight, double CanvasWidth) {
// calling Shape constructor
        super(color);
        this.CanvasHeight = CanvasHeight;
        this.CanvasWidth = CanvasWidth;
    }
}

