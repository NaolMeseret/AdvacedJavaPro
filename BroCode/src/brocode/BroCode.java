
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BroCode extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button();
        Button exit = new Button();

        btn.setText("Click me");
        exit.setText(" Exit");

     
        exit.setOnAction(e -> {
            System.out.println("Bye");
            System.exit(0);
        });

        VBox root = new VBox();
        root.getChildren().addAll(btn, exit);
        Scene scene = new Scene(root, 500, 300);
        stage.setScene(scene);

        stage.show();
    }

}
