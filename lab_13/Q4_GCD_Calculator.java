import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.*;

public class Q4_GCD_Calculator extends Application {
    public void start(Stage primaryStage) {
        Label title = new Label("GCD Calculator");
        Label label1 = new Label("Enter number 1:");
        Label label2 = new Label("Enter number 2:");
        Label answer = new Label();

        TextField num1Field = new TextField();
        TextField num2Field = new TextField();

        Button btn = new Button("Calculate");

        GridPane root = new GridPane();

        Scene scene = new Scene(root, 500, 300);

        root.setHgap(30);
        root.setVgap(20);
        root.setAlignment(Pos.CENTER);

        title.setFont(new Font("Arial", 18));

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                try {
                    Integer n1 = Integer.valueOf(num1Field.getText());
                    Integer n2 = Integer.valueOf(num2Field.getText());

                    if (n1 < 1 || n2 < 1)
                        answer.setText("Numbers much be positive");
                    else
                        answer.setText("GCD(" + n1 + ", " + n2 + ") = " + gcd(n1, n2));
                } catch (NumberFormatException e) {
                    answer.setText("Invalid input");
                }
            }
        };
        btn.setOnAction(handler);

        root.add(title, 0, 0);
        root.add(label1, 0, 1);
        root.add(num1Field, 1, 1);
        root.add(label2, 0, 2);
        root.add(num2Field, 1, 2);
        root.add(btn, 0, 3);
        root.add(answer, 1, 3);

        primaryStage.setTitle("GCD Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    static int gcd(int a, int b) {
        int larger = a > b ? a : b;
        int smaller = a < b ? a : b;

        for (int i = smaller; i > 0; i--) {
            if (larger % i == 0 && smaller % i == 0)
                return i;
        }
        return -999;
    }
}
