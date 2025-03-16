
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        
           Label phoneLabel= new Label("Phone:");
         TextField phoneField = new TextField();
        phoneField.setPromptText("Enter your PHone Number");
        HBox phoneRow = new HBox(30, phoneLabel, phoneField);

        Label genderLabel = new Label("Gender:");
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton maleButton = new RadioButton("Male");
        RadioButton femaleButton = new RadioButton("Female");
        maleButton.setToggleGroup(genderGroup);
        femaleButton.setToggleGroup(genderGroup);
        HBox genderRow = new HBox(10, genderLabel, maleButton, femaleButton);

        
        Button resetButton = new Button("Reset");
        Button saveButton = new Button("Save");

        // e: represent event
        resetButton.setOnAction(e -> {
            // nameField.clear();
            // idField.clear();
            // genderGroup.selectToggle(null);
//            THS CALLED LAMDA EXPRESSION
        });

        saveButton.setOnAction(e -> {
            Toggle selectedToggle = genderGroup.getSelectedToggle();
            String gender = (selectedToggle != null) ? ((RadioButton) selectedToggle).getText() : "Not specified";
            System.out.println("Name: " + nameField.getText() + ", ID: " + idField.getText() + ", Gender: " + gender);
        });

        HBox buttonRow = new HBox(10, resetButton, saveButton);

        
        VBox layout = new VBox(15, nameRow, idRow, genderRow, buttonRow, phoneRow);
        layout.setStyle("-fx-padding: 20px;");

        
        Scene scene = new Scene(layout, 400, 250);
        stage.setTitle("Registration Page");
        stage.setScene(scene);
        stage.show();
    }
// key event
// mouse event
// key event : listener , relesed and type
// 

    public static void main(String[] args) {
        launch(args);
    }
}
// TextArea for calculator history

// ComboBOX like Department : software, IT, IS, CIVIL, ELECTRICAL