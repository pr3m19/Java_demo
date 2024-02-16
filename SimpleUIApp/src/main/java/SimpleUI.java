import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple UI Example");

        Button btn = new Button();
        btn.setText("Click Me!");
        btn.setOnAction(e -> showMessage());

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private void showMessage() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("You clicked the button!");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
