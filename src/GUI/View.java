package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class View {
    public void mainView(Stage primaryStage)
    {
        primaryStage.setTitle("Fitness Tracker");
        AddBox.init();
        Button addButton = new Button("Add new Activity");
        Button showButton = new Button("Show recorded activities");
        Button closeButton = new Button("Close");

        addButton.setOnAction(e->AddBox.display());
        showButton.setOnAction(e->ResultsBox.display());
        closeButton.setOnAction(e->handleCancelButton(primaryStage));
        primaryStage.setOnCloseRequest(e->
        {
            e.consume();
            handleCancelButton(primaryStage);
        });

        VBox layout1 = new VBox();
        layout1.setPadding(new Insets(10,10,10,10));
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(addButton,showButton,closeButton);

        primaryStage.setMinHeight(90);
        primaryStage.setMinWidth(100);
        primaryStage.setScene(new Scene(layout1,255,90));
        primaryStage.show();

    }
    public static void handleCancelButton(Stage window)
    {
        boolean ans = ConfirmBox.display("CLOSE","Are you sure you want to close and ignore all data?");
        if (ans)
            window.close();
    }

}
