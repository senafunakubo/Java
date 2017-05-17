package JavaGUI;

/**
 * Created by senafunakubo on 2017-05-16.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author CICCC-CIRAC
 */
public class JavaFXSetting extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lb1 = new Label("this is first scene label");
        Label lb2 = new Label("this is second scene label");
        Button btn1 = new Button("CLICK ME");


        GridPane gp1 = new GridPane();
        gp1.add(lb1, 0, 1);
        gp1.add(btn1,3, 2);
        //gp1.add(lb2,3,3);
        Scene scen1 = new Scene(gp1,400,400);
        Scene scen2 = new Scene(lb2,400,400);
        primaryStage.setTitle("hello to javaFX");
        primaryStage.setScene(scen1);
        btn1.setOnAction(event -> primaryStage.setScene(scen2));
        primaryStage.show();
    }

}
