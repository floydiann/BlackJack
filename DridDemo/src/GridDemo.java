import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.awt.*;

/**
 * Created by Tom on 8/31/2015.
 */
public class GridDemo extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //1.Layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5,5,5,10));
        gridPane.setGridLinesVisible(true);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        Button button = new Button("1");
        gridPane.add(button, 1, 1);

        //2. Scene

        Scene scene = new Scene(gridPane, 400, 300);

        //3. set scene and show()
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    }
}
