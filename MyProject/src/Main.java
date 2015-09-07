import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
            VBox vBox = new VBox();
            Button button = new Button("Style me!");
            Button button2 = new Button("Style me too!");
            button.setId("bigButton"); // # om css file
            button.getStyleClass().add("bigButtons"); // .in css file
            button2.getStyleClass().add("bigButtons");
            vBox.getChildren().addAll(button, button2);
            Scene scene = new Scene(vBox, 300,200);
            primaryStage.setScene(scene);
            primaryStage.show();
    }
}
