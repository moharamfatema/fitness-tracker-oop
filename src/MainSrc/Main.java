package MainSrc;

import GUI.AddBox;
import GUI.View;
import javafx.application.*;
import javafx.stage.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        new View().mainView(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
