import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Gui extends Application
{
    public static void main(String[] args){

        String a1 = JOptionPane.showInputDialog(null, "How many sides?");
        int a1int = Integer.parseInt(a1);
        String a2 = JOptionPane.showInputDialog(null, "How many dices?");
        int a2int = Integer.parseInt(a2);



        Application.launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Layout
        BorderPane borderPane = new BorderPane();
        //gridPane.setPadding(new Insets(Double.MAX_VALUE, Double.MAX_VALUE))

        Button b1 = new Button("Roll");
        //button1.setMaxSize(, Double.MAX_VALUE);
        Button b2 = new Button("Cancel");

        b1.Pos.TOP_LEFT;



        Scene scene = new Scene(borderPane, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}