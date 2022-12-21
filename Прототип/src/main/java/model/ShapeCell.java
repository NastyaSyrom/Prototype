package model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;

public class ShapeCell extends ListCell<Shapes> {
    @Override
    public void updateItem(Shapes item, boolean empty) {
        super.updateItem(item, empty);
        if (item != null) {
            Canvas cnv=new Canvas();
            cnv.setHeight(100.0);// задание размера элемента отображения
            cnv.setWidth(180.0);
            GraphicsContext gc=cnv.getGraphicsContext2D();
            Shapes item1=(Shapes)item.clone();//текущая фигура из списка ObservableList
            item1.Draw(gc, 1.0, 1.0); // ее отрисовка на канве
            setGraphic(cnv); //установка канваса вместо cell
        }

    }

}
