import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.*;

public class Q2_Multiplication_Table extends Application {
    public void start(Stage primaryStage) {
        Label title = new Label("Multiplication Table");

        TextField numInput = new TextField();

        Button submitBtn = new Button("Calculate");

        GridPane root = new GridPane();
        GridPane table = new GridPane();

        Scene scene = new Scene(root, 500, 400);

        root.setHgap(30);
        root.setVgap(20);
        root.setAlignment(Pos.CENTER);

        title.setFont(new Font("Arial", 18));

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                int row_i = 0;
                table.getChildren().clear();
                try {
                    Integer n = Integer.valueOf(numInput.getText());
                    for (int i = 0; i < 10; i++) {
                        Label row = new Label(n + " * " + (i + 1) + " = " + (n * (i + 1)));
                        table.add(row, 0, row_i++);
                    }
                } catch (Exception e) {
                    Label error = new Label(e.toString());
                    table.add(error, 0, row_i++);
                }
            }
        };
        submitBtn.setOnAction(handler);

        root.add(title, 0, 0);
        root.add(numInput, 0, 1);
        root.add(submitBtn, 1, 1);
        root.add(table, 0, 2);

        primaryStage.setTitle("Multiplication Table");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
