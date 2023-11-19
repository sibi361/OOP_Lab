import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class Q8_Display_Circle_Find_Area extends Application {
    public void start(Stage primaryStage) {
        Label title = new Label("JavFX Circle Drawer");
        Label diameterInputLabel = new Label("Enter diameter: ");
        Label radiusLabel = new Label();
        Label outputLabel = new Label();

        Button btn = new Button("Go");

        TextField diameterInput = new TextField();

        GridPane root = new GridPane();

        RadioButton button1 = new RadioButton("Calculate area");
        RadioButton button2 = new RadioButton("Calculate circumference");

        ToggleGroup group = new ToggleGroup();

        ListView<RadioButton> list = new ListView<RadioButton>();

        Canvas canvas = new Canvas(400, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Scene scene = new Scene(root, 800, 500);

        title.setFont(new Font("Arial", 18));

        root.setPadding(new Insets(5));
        root.setHgap(5);
        root.setVgap(5);
        root.setAlignment(Pos.CENTER);

        button1.setSelected(true);
        button1.setToggleGroup(group);
        button2.setToggleGroup(group);

        list.getItems().add(button1);
        list.getItems().add(button2);

        gc.setFill(Color.PURPLE);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (diameterInput.getText().length() == 0)
                    return;

                Float radiusFloat = Float.parseFloat(diameterInput.getText()) / 2;
                Integer diameterInt = Math.round(radiusFloat) * 2;

                RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();

                radiusLabel.setText("Radius = " + radiusFloat);

                if (selectedRadioButton == null)
                    return;
                else if (selectedRadioButton.getText().indexOf("area") != -1)
                    outputLabel.setText("Area = " + (Math.pow(radiusFloat, 2) * 3.14) + " square units");
                else
                    outputLabel.setText("Circumference = " + (2 * 3.14 * radiusFloat) + " units");

                // draw circle
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.fillOval(20, 20, diameterInt, diameterInt);
            }
        };
        btn.setOnAction(handler);

        root.add(title, 0, 0);
        root.add(diameterInputLabel, 0, 2);
        root.add(diameterInput, 1, 2);
        root.add(btn, 2, 2);
        root.add(list, 0, 3);
        root.add(radiusLabel, 0, 5);
        root.add(outputLabel, 0, 6);
        root.add(canvas, 1, 3);

        primaryStage.setTitle("JavFX Circle Drawer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
