package JavaGUI;

/**
 * Created by senafunakubo on 2017-05-16.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TaxJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Tax Calculator");

        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.CENTER);
        gp1.setPadding(new Insets(25, 25, 25, 25));
        gp1.setHgap(10);
        gp1.setVgap(10);


        Label label1 = new Label("Tax Calculator");
        label1.setFont(new Font("gothic", 20.0d));
        gp1.add(label1, 0, 0,2,1);

        Label income = new Label("Income: ");
        income.setFont(new Font("gothic", 14.0d));
        gp1.add(income, 0, 1);

        TextField textFieldI = new TextField();
        gp1.add(textFieldI, 1, 1);

        Label tax = new Label("%Tax: ");
        tax.setFont(new Font("gothic", 14.0d));
        gp1.add(tax, 0, 2);

        TextField textFieldT = new TextField();
        gp1.add(textFieldT, 1, 2);

        Label afterCalculate = new Label("Tax incurred: ");
        afterCalculate.setFont(new Font("gothic", 10.0d));
        gp1.add(afterCalculate, 0, 4);

        Label amount = new Label("0");
        amount.setFont(new Font("gothic", 10.0d));
        gp1.add(amount, 1, 4);

        Button btn1 = new Button("Calculator");
        btn1.setFont(new Font("gothic", 10.0d));
        VBox hbBtn = new VBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn1);
        gp1.add(btn1, 1, 3);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                Double incomes = Double.parseDouble(textFieldI.getText());
                Double taxes = Double.parseDouble(textFieldT.getText());

                if (!textFieldI.getText().isEmpty() && !textFieldT.getText().isEmpty()) {
                    Double money = incomes * (taxes / 100);
                    amount.setText("" + money);
                } else {
                    System.out.println("Something wrong.");
                }
            }
        });


        Scene scene = new Scene(gp1, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

