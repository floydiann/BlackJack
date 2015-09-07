/**
 * Created by Tom on 8/28/2015.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    //Exercise 1: Create a primitive LiginApp, which has:
    //A Label, TextField, Butn. Button-click should show the inputted name on the label
    Scene scene1;
    Scene scene2;
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        VBox vBox = new VBox(); //Layout
        Button loginButton = new Button("Log in");
        Label label = new Label();
        TextField logint = new TextField();
        TextField password = new TextField();
        loginButton.setOnAction(event -> {
            primaryStage.setScene(scene2);  //move to scene2
        });

        loginButton.setStyle("-fx-font-size: 20");
        vBox.getChildren().addAll(label, logint, password, loginButton);
        scene1 = new Scene(vBox,300,200);
        HBox hBox = new HBox();
        scene2 = new Scene(hBox, 400, 300);
        primaryStage.setScene(scene1);
        primaryStage.show();


    }
}
