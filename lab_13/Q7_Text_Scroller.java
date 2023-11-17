import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

class Horizontal extends Thread {
    HBox box;
    String str;

    Horizontal(HBox hb, String s) {
        box = hb;
        str = s;
    }

    public void start() {
        scrollingTextHorizontal(box, str);
    }

    public void scrollingTextHorizontal(HBox parent, String text) {
        Text scrollingText = new Text(text);
        parent.getChildren().add(scrollingText);
        scrollingText.setLayoutX(0);
        scrollingText.setLayoutY(20);
        scrollingText.setWrappingWidth(500);
        TranslateTransition tt = new TranslateTransition(Duration.millis(30000), scrollingText);
        tt.setFromX(0 - scrollingText.getWrappingWidth() - 10);

        int boundWidth = (int) parent.getBoundsInParent().getWidth();
        tt.setToX(scrollingText.getWrappingWidth() + boundWidth);

        tt.setCycleCount(Timeline.INDEFINITE);
        tt.setAutoReverse(false);
        tt.play();
    }
}

class Vertical extends Thread {
    VBox box;
    String str;

    Vertical(VBox vb, String s) {
        box = vb;
        str = s;
    }

    public void start() {
        scrollingTextVertical(box, str);
    }

    public void scrollingTextVertical(VBox parent, String text) {
        Text scrollingText = new Text(text);
        parent.getChildren().add(scrollingText);
        scrollingText.setLayoutX(0);
        scrollingText.setLayoutY(20);
        scrollingText.setWrappingWidth(500);
        TranslateTransition tt = new TranslateTransition(Duration.millis(30000), scrollingText);
        tt.setFromY(0 - scrollingText.getWrappingWidth() - 10);

        int boundWidth = (int) parent.getBoundsInParent().getWidth();
        tt.setToY(scrollingText.getWrappingWidth() + boundWidth);

        tt.setCycleCount(Timeline.INDEFINITE);
        tt.setAutoReverse(false);
        tt.play();
    }
}

public class Q7_Text_Scroller extends Application {
    public void start(Stage primaryStage) {
        Label title = new Label("JavFX Text Scroller");
        Label textInputLabel = new Label("Enter text to scroll: ");

        TextField textInput = new TextField();
        Button submitBtn = new Button("Start scrolling");

        RadioButton verticalRadio = new RadioButton("Vertical scroll");
        RadioButton horizontalRadio = new RadioButton("Horizontal scroll");
        ToggleGroup group = new ToggleGroup();

        HBox scrollingAreaX = new HBox();
        VBox scrollingAreaY = new VBox();

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 500, 400);

        title.setFont(new Font("Arial", 18));

        verticalRadio.setSelected(true);
        verticalRadio.setToggleGroup(group);
        horizontalRadio.setToggleGroup(group);

        root.setHgap(30);
        root.setVgap(20);
        root.setAlignment(Pos.CENTER);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String text = textInput.getText();
                RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
                String selected = selectedRadioButton.getText();
                if (text.length() == 0)
                    return;
                else if (selected.indexOf("Horizontal") != -1)
                    new Horizontal(scrollingAreaX, text).start();
                else
                    new Vertical(scrollingAreaY, text).start();
            }
        };
        submitBtn.setOnAction(handler);

        root.setAlignment(Pos.CENTER);
        root.add(title, 0, 0);
        root.add(textInputLabel, 0, 2);
        root.add(textInput, 1, 2);
        root.add(verticalRadio, 0, 3);
        root.add(horizontalRadio, 1, 3);
        root.add(submitBtn, 0, 4);
        root.add(scrollingAreaX, 0, 5);
        root.add(scrollingAreaY, 0, 6);

        primaryStage.setTitle("JavaFx Text Scroller");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setMaximized(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
