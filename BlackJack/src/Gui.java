import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Gui extends Application
{
    public static void main(String[] args){
        Application.launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox vBox = new VBox(); //layout
        Label label = new Label();
        Button playButton = new Button("Play");
        Button cancelButton = new Button("Cancel");
        Button hitButton = new Button("Hit");
        Button standButton = new Button("Stand");


    }
}