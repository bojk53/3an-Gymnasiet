import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Faggot extends Application implements EventHandler<ActionEvent> {
    Button France = new Button("France");
    Button Norway = new Button("Norway");
    Button Niger = new Button("Niger");
    Button Arab = new Button("Arab Emirate");
    BorderPane border = new BorderPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox hbox = addHBox();
        border.setTop(hbox);

        France.setOnAction(this);
        Norway.setOnAction(this);
        Niger.setOnAction(this);
        Arab.setOnAction(this);


        Scene scene = new Scene(border, 1000, 700);
        primaryStage.setTitle("go baja");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public HBox addHBox(){
        HBox hbox = new HBox();

        France.setPrefSize( 110, 20);
        Norway.setPrefSize(110, 20);
        Niger.setPrefSize(110, 20);
        Arab.setPrefSize(110, 20);

        hbox.getChildren().addAll(France,Norway,Niger,Arab);
        return hbox;
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == France){
            border.setCenter(Läxor.Franska.Frankrike(new Group()));
        }
        if (event.getSource() == Norway){
            border.setCenter(Norge.Norska(new Group()));
        }
        if (event.getSource() == Niger){
            border.setCenter(Nigerhehe.Nigers(new Group()));
        }
        if (event.getSource() == Arab){
            border.setCenter(Araben.Arabens(new Group()));
        }

    }
}

