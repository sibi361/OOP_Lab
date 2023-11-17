import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Q1_JavaFX_Hello_World extends Application {
    public void start(Stage primaryStage) {
        Label label = new Label("Welcome to JavaFX Programming");

        FlowPane root = new FlowPane();

        Scene scene = new Scene(root, 500, 200);

        label.setTextFill(Color.color(1, 0, 1));
        label.setFont(new Font("Arial", 18));

        FlowPane.setMargin(label, new Insets(50, 0, 0, 100));
        root.setHgap(50);
        root.setVgap(20);

        root.getChildren().add(label);

        primaryStage.setTitle("This is the first JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
