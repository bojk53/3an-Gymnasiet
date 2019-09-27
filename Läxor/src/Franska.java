import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Franska {
    public static Group Frankrike(Group panel) {

        //Drawing a Circle
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();

        //Setting the properties of the circle
        rectangle.setHeight(300);
        rectangle.setWidth(200);
        rectangle.setFill(Color.BLUE);

        rectangle1.setHeight(300);
        rectangle1.setWidth(200);
        rectangle1.setFill(Color.RED);
        rectangle1.setX(400);

        panel.getChildren().addAll(rectangle, rectangle1);
        return panel;

    }

}