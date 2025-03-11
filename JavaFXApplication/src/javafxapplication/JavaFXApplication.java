package javafxapplication;  

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.VBox;  
import javafx.stage.Stage;  

public class JavaFXApplication extends Application {  

    public static void main(String[] args) {  
        launch(args); // Starts the JavaFX application  
    }  

    @Override  
public void start(Stage primaryStage) {  
    Label label = new Label("Enter your name:");  
    label.getStyleClass().add("label"); // Apply CSS class

    Button button = new Button("Submit");  
    button.getStyleClass().add("button"); // Apply CSS class

    VBox layout = new VBox(10);  
    layout.getChildren().addAll(label, button);  

    Scene scene = new Scene(layout, 350, 200);
    scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm()); // Link CSS file  

    primaryStage.setTitle("Styled JavaFX App");  
    primaryStage.setScene(scene);  
    primaryStage.show();  
}

     
}
