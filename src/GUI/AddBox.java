package GUI;

import Model.MainModel;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.*;

public class AddBox {
    public static Stage window = new Stage();
    public static GridPane pane = new GridPane();
    public static Label activLabel = new Label("Activity: ");
    public static ChoiceBox<String> activityList = new ChoiceBox<>();
    public static Label timeLabel = new Label("Time: ");
    public static TextField timeField = new TextField("1");
    public static Label minutes = new Label("minutes");
    public static Button addButton = new Button("Add");
    public static Button cancelButton = new Button("Cancel");
    public static Scene scene = new Scene(pane,350,175);

    public static void display()
    {

        window.setScene(scene);
        window.showAndWait();
    }
    public static void handleCancelButton()
    {
        boolean ans = ConfirmBox.display("CLOSE","Are you sure you do not want to add an activity?");
        if (ans)
            window.close();
    }
    public static void handleAddButton()
    {

        if (isTime(timeField))
        {
            MainModel.setActivity(activityList.getValue(),Integer.parseInt(timeField.getText()));
            AlertBox.display("SUCCESS","Activity recorded successfully.");
            window.close();
        } else
            AlertBox.display("Invalid Input",timeField.getText()+" is invalid.\nPlease enter a positive integer number for the time");
    }

    public static boolean isTime(TextField input)
    {
        try
        {
            int time = Integer.parseInt(input.getText());
            return time >= 1;
        }catch (NumberFormatException e)
        {
            return false;
        }
    }
    public static void init()
    {
        window.setTitle("Fitness Tracker - Add Activity");
        window.setMinWidth(350);
        window.setMinHeight(200);
        window.initModality(Modality.APPLICATION_MODAL);

        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(10);
        pane.setHgap(20);

        GridPane.setConstraints(activLabel,0,0);

        activityList.getItems().addAll("Swimming","Running","Kick Boxing","Strength Training");
        activityList.setValue("Swimming");
        GridPane.setConstraints(activityList,1,0);

        GridPane.setConstraints(timeLabel,0,1);

        timeField.setPromptText("time");
        GridPane.setConstraints(timeField,1,1);

        GridPane.setConstraints(minutes,2,1);

        GridPane.setConstraints(addButton,2,3);
        addButton.setOnAction(e->handleAddButton());
        GridPane.setConstraints(cancelButton,2,4);
        addButton.setOnAction(e->handleAddButton());
        cancelButton.setOnAction(e->handleCancelButton());

        pane.getChildren().addAll(activLabel,activityList,timeLabel,timeField,minutes,addButton,cancelButton);

        window.setOnCloseRequest(e->
        {
            e.consume();
            handleCancelButton();
        });

    }

}
