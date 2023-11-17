import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.*;

public class Q3_Login_Page extends Application {
    public void start(Stage primaryStage) {
        Label title = new Label("Welcome");
        Label usernameLabel = new Label("User Name:");
        Label passwordLabel = new Label("Password:");
        Label message = new Label();

        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        Button submitBtn = new Button("Sign in");

        GridPane root = new GridPane();

        Scene scene = new Scene(root, 500, 300);

        root.setHgap(30);
        root.setVgap(20);
        root.setAlignment(Pos.CENTER);

        title.setFont(new Font("Arial", 18));

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (usernameField.getText().length() != 0)
                    if (passwordField.getText().length() != 0)
                        message.setText("Hello " + usernameField.getText());
                    else
                        message.setText("Enter password");
                else
                    message.setText("Enter username");
            }
        };
        submitBtn.setOnAction(handler);

        root.add(title, 0, 0);
        root.add(usernameLabel, 0, 1);
        root.add(usernameField, 1, 1);
        root.add(passwordLabel, 0, 2);
        root.add(passwordField, 1, 2);
        root.add(message, 0, 3);
        root.add(submitBtn, 1, 3);

        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
