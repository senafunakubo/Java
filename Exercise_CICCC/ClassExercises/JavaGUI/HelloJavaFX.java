package JavaGUI;/**
 * Created by senafunakubo on 2017-05-16.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 *
 * @author CICCC-CIRAC
 */
public class HelloJavaFX extends Application {

    //he stage is where all the visual parts of
    //the JavaFX application are displayed
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("hello to javafx");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
