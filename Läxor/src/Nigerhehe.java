import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

    public class Nigerhehe {
        public static Group Nigers(Group panel){



            //Drawing a Circle
            Rectangle rectangle = new Rectangle();
            Rectangle rectangle1 = new Rectangle();
            Circle circle = new Circle();

            //Setting the properties of the circle
            rectangle.setHeight(100);
            rectangle.setWidth(600);
            rectangle.setFill(Color.ORANGE);

            rectangle1.setHeight(100);
            rectangle1.setWidth(600);
            rectangle1.setFill(Color.GREEN);
            rectangle1.setY(200);

            //inner circle
            circle.setCenterX(300);
            circle.setCenterY(150);
            circle.setRadius(40);
            circle.setFill(Color.ORANGE);

            panel.getChildren().addAll(rectangle,rectangle1,circle);
            return panel;

        }

    }
