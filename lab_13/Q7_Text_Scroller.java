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

class TextScroller extends Thread {
    HBox box;
    String scroll_text;
    boolean left_to_right;

    TextScroller(HBox hb, String scroll_text_input, boolean left_to_right) {
        box = hb;
        scroll_text = scroll_text_input;
        this.left_to_right = left_to_right;
    }

    public void start() {
        scrollingTextHorizontal(box, scroll_text);
    }

    public void scrollingTextHorizontal(HBox parent, String text) {
        Text scrollingText = new Text(text);
        parent.getChildren().add(scrollingText);
        TranslateTransition tt = new TranslateTransition(Duration.millis(3000), scrollingText);
        int boundWidth = (int) parent.getBoundsInParent().getWidth();

        if (left_to_right) {
            tt.setFromX(0 - scrollingText.getWrappingWidth() - 10);
            tt.setToX(scrollingText.getWrappingWidth() + boundWidth);
        } else {
            tt.setFromX(scrollingText.getWrappingWidth() + boundWidth);
            tt.setToX(0 - scrollingText.getWrappingWidth() - 10);
        }

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

        RadioButton lrRadio = new RadioButton("Left to Right");
        RadioButton rlRadio = new RadioButton("Right to Left");
        ToggleGroup group = new ToggleGroup();

        HBox scrollingArea = new HBox();

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 500, 400);

        title.setFont(new Font("Arial", 18));

        lrRadio.setToggleGroup(group);
        rlRadio.setToggleGroup(group);

        root.setHgap(30);
        root.setVgap(20);
        root.setAlignment(Pos.CENTER);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String text = textInput.getText();
                RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
                if (text.length() == 0 || selectedRadioButton == null)
                    return;
                new TextScroller(scrollingArea, text, selectedRadioButton.getText() == "Left to Right").start();
            }
        };
        submitBtn.setOnAction(handler);

        root.add(title, 0, 0);
        root.add(textInputLabel, 0, 2);
        root.add(textInput, 1, 2);
        root.add(lrRadio, 0, 3);
        root.add(rlRadio, 1, 3);
        root.add(submitBtn, 0, 4);
        root.add(scrollingArea, 0, 5);

        primaryStage.setTitle("JavaFx Text Scroller");
        primaryStage.setScene(scene);
        primaryStage.show();
        // primaryStage.setMaximized(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
