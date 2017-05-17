package JavaGUI;

/**
 * Created by senafunakubo on 2017-05-16.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;


public class JavaFXAppGoBackMain extends Application {

    private Scene first = null;
    private Scene second = null;

    private static int WINDOW_WIDTH = 300;
    private static int WINDOW_HEIGHT = 120;


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("GoBackSystem");

        this.initFirst(stage);
        this.initSecond(stage);

        stage.setScene(first);
        stage.show();
    }


    private void initFirst(Stage stage) {
        Group root = new Group();
        this.first = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.WHITE);

        Label label1 = new Label("Scene 1");
        label1.setFont(new Font("gothic", 18.0d));

        Button btn1 = new Button("GO to 2nd");
        btn1.setFont(new Font("gothic", 14.0d));
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                stage.setScene(second);
                stage.show();
            }
        });

        VBox vb = new VBox();
        vb.getChildren().add(label1);
        vb.getChildren().add(btn1);

        root.getChildren().add(vb);
    }


    private void initSecond(Stage stage) {
        Group root = new Group();
        this.second = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.WHITE);

        Label label1 = new Label("Scene 2");
        label1.setFont(new Font("gothic", 18.0d));

        Button btn1 = new Button("GO to 1st");
        btn1.setFont(new Font("gothic", 14.0d));
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                stage.setScene(first);
                stage.show();
            }
        });

        VBox vb = new VBox();
        vb.getChildren().add(label1);
        vb.getChildren().add(btn1);

        root.getChildren().add(vb);
    }


    public static void execFrame(String[] args) {
        launch();
    }
}