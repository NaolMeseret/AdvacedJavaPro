package javafxapplication;  

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.layout.VBox;  
import javafx.stage.Stage;  

public class JavaFXApplication extends Application {  

    public static void main(String[] args) {  
        launch(args); // Starts the JavaFX application  
    }  

    @Override  
    public void start(Stage primaryStage) {  
        // Creating a label
        Label label = new Label("Welcome to JavaFX!");  

        // Creating a button
        Button button = new Button("Click Me");  
        button.setOnAction(e -> label.setText("Button Clicked!")); // Change label text when clicked  

        // Layout (VBox = Vertical Box)
        VBox layout = new VBox(10); // 10px spacing  
        layout.getChildren().addAll(label, button);  

        // Scene (holds layout)
        Scene scene = new Scene(layout, 300, 200); // Width: 300, Height: 200  

        // Stage (window setup)
        primaryStage.setTitle("JavaFX App");  
        primaryStage.setScene(scene);  
        primaryStage.show(); // Display window  
    }  
}
