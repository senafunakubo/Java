package JavaGUI;

/**
 * Created by senafunakubo on 2017-05-16.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author CICCC-CIRAC
 */

//addingScene

public class ClassDemoOfLogin extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("adding scene component");
        // Label lbl1 = new Label("hello to java FX its scene1");
        // Button btn1 = new Button("SCENE1");
        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.CENTER);
        // gp1.add(lbl1, 0, 1);
        // gp1.add(btn1, 0, 2);



        Label userName = new Label("User Name:");
        gp1.add(userName, 0, 1);

        TextField userTextField = new TextField();
        gp1.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        gp1.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        gp1.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        btn.setAlignment(Pos.CENTER);
        gp1.add(btn,1,3);

        btn.setStyle("-fx-background-color : #00ff00");
        Label msg = new Label();
        gp1.add(msg, 1,4);
        btn.setOnAction((event) -> {msg.setText("you clicked button");
        });

        Scene scene1 = new Scene(gp1, 400, 400);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
