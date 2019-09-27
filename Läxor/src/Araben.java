import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

    public class Araben {
        public static Group Arabens(Group panel) {

            //Drawing a Circle
            Rectangle rectangle = new Rectangle();
            Rectangle rectangle1 = new Rectangle();
            Rectangle rectangle2 = new Rectangle();

            //Setting the properties of the circle
            rectangle.setHeight(300);
            rectangle.setWidth(200);
            rectangle.setFill(Color.RED);

            rectangle1.setHeight(100);
            rectangle1.setWidth(600);
            rectangle1.setFill(Color.DARKGREEN);
            rectangle1.setX(200);

            rectangle2.setHeight(100);
            rectangle2.setWidth(600);
            rectangle2.setFill(Color.BLACK);
            rectangle2.setX(200);
            rectangle2.setY(200);


            panel.getChildren().addAll(rectangle,rectangle1,rectangle2);
            return panel;

        }

    }

