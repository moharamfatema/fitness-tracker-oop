package GUI;
import MainSrc.ActivisData;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ResultsBox {
    public static void display()
    {
        Stage window = new Stage();
        window.setTitle("Fitness Tracker - Recorded Activities");
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(400);

        TableColumn<ActivisData,String> typeColumn= new TableColumn<>("Type");
        typeColumn.setMinWidth(125);
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<ActivisData,Integer> calsColumn= new TableColumn<>("Calories Burnt");
        calsColumn.setMinWidth(100);
        calsColumn.setCellValueFactory(new PropertyValueFactory<>("calsBurnt"));

        TableColumn<ActivisData,Double> heartRateColumn= new TableColumn<>("Heart Rate Increase Value");
        heartRateColumn.setMinWidth(150);
        heartRateColumn.setCellValueFactory(new PropertyValueFactory<>("heartRateInc"));

        TableView<ActivisData> tableView = new TableView<>();
        tableView.setItems(getActivities());
        tableView.getColumns().addAll(typeColumn,calsColumn,heartRateColumn);

        Label calsLabel = new Label("\nTotal calories burnt: "+ActivisData.getTotalCals()+" Calories.");
        Label heartRateLabel = new Label("Heart rate: ~"+ActivisData.getHeartRate()+" beats per minute.");

        VBox layout = new VBox();
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(tableView,calsLabel,heartRateLabel);

        Scene scene = new Scene(layout,400,500);

        window.setMinHeight(500);
        window.setScene(scene);
        window.showAndWait();
    }

    private static ObservableList<ActivisData> getActivities()
    {
        ObservableList<ActivisData> activities = FXCollections.observableArrayList();
        /*activities.add(new ActivisData("Swimming",150,(8.0/1000.0)));
        activities.add(new ActivisData("Swimming",40,6.0/1000.0));
        activities.add(new ActivisData("Kick Boxing",20,2/1000.0));
        activities.add(new ActivisData("Running",10,9/1000.0));*/
        return activities;
    }
}
