import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextFieldExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        textField.setPromptText("Enter text");
        
        Button resetButton = new Button("Reset");
        Button saveButton = new Button("Save");
        
        resetButton.setOnAction(e -> textField.clear());
        saveButton.setOnAction(e -> System.out.println("Saved: " + textField.getText()));
        
        HBox hbox = new HBox(10, textField, resetButton, saveButton);
        Scene scene = new Scene(hbox, 300, 50);
        
        primaryStage.setTitle("TextField Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
