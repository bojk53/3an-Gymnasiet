import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Norge {

    public static Group Norska(Group panel) {
        //red
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();

        //blue
        Rectangle rectangle4 = new Rectangle();
        Rectangle rectangle5 = new Rectangle();

        //red parts
        rectangle.setHeight(120);
        rectangle.setWidth(120);
        rectangle.setFill(Color.RED);

        rectangle1.setHeight(120);
        rectangle1.setWidth(120);
        rectangle1.setFill(Color.RED);
        rectangle1.setY(200);

        rectangle2.setHeight(120);
        rectangle2.setWidth(240);
        rectangle2.setFill(Color.RED);
        rectangle2.setX(180);

        rectangle3.setHeight(120);
        rectangle3.setWidth(240);
        rectangle3.setFill(Color.RED);
        rectangle3.setX(180);
        rectangle3.setY(200);

        //blue parts
        rectangle4.setHeight(320);
        rectangle4.setWidth(30);
        rectangle4.setFill(Color.DARKBLUE);
        rectangle4.setX(135);

        rectangle5.setHeight(30);
        rectangle5.setWidth(420);
        rectangle5.setFill(Color.DARKBLUE);
        rectangle5.setY(145);


        panel.getChildren().addAll(rectangle,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5);
        return panel;
    }

}