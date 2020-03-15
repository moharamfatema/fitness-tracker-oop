package MainSrc;

import GUI.View;
import javafx.application.*;
import javafx.stage.*;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        new View().mainView(primaryStage);
    }
}


