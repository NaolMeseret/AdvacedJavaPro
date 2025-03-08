package javafxapplication;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage PrimaryStage) throws Exception {
        
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
        Stage stage = new Stage();
        
        Text text = new Text();
        text.setText("Welcome!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.GREEN);

        Line line = new Line();
        line.setStartX(60);
        line.setStartY(60);
        line.setEndX(300);
        line.setEndY(60);
        line.setStrokeWidth(5);
        line.setStroke(Color.BLUE);
        
        root.getChildren().add(text);
        root.getChildren().add(line);
        stage.setTitle("Welcome Naol");
        stage.setScene(scene);
        stage.show();
    }
}
