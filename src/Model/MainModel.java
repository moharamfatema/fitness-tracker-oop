package Model;

import MainSrc.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MainModel {
    /*variables*/
    public static int cals = 0; //total calories burnt
    public static double heartRate = 80;
    static Activity swimming = new Activity("Swimming",4,2.0/1000.0);
    static Activity running = new Activity("Running",5,3.0/1000.0);
    static Activity kickBoxing = new Activity("Kick Boxing",3,5.0/1000.0);
    static Activity strengthTraining = new Activity("Strength Training",5,6.0/1000.0);
    public static ObservableList<ActivisData> data = FXCollections.observableArrayList();

    public static void setActivity(String type,int time)
    {
        switch (type){
            case "Swimming":
                swimming.add(time);
                break;
            case "Running":
                running.add(time);
                break;
            case "Kick Boxing":
                kickBoxing.add(time);
                break;
            case "Strength Training":
                strengthTraining.add(time);
                break;
        }
    }

}
