
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class First extends Application {

    @Override
    public void start(Stage stage) {
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        HBox nameRow = new HBox(10, nameLabel, nameField);

        Label idLabel = new Label("ID:");
        TextField idField = new TextField();
        idField.setPromptText("Enter your ID");

        HBox idRow = new HBox(30, idLabel, idField);

        Button resetButton = new Button("Reset");
        Button saveButton = new Button("Save");

        resetButton.setOnAction(e -> {
            nameField.clear();
            idField.clear();
        });

        saveButton.setOnAction(e
                -> System.out.println("Name: " + nameField.getText() + ", ID: " + idField.getText())
        );

        HBox buttonRow = new HBox(10, resetButton, saveButton);

        VBox layout = new VBox(15, nameRow, idRow, buttonRow);
        layout.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(layout, 350, 200);
        stage.setTitle("Registration Page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
