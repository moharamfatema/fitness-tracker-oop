package Model;
import MainSrc.ActivisData;

public class Activity {

    private final String type;
    private final int calsPerMin; //calories burnt per minute
    private final double heartIncRate;

    public Activity(String type, int calsPerMin, double heartIncRate) {
        this.type = type;
        this.calsPerMin = calsPerMin;
        this.heartIncRate = heartIncRate;
    }

    public void add(int time)
    {
        double heartRateInc = MainModel.heartRate * (double) time * heartIncRate;
        int calsBurnt = time * calsPerMin;
        MainModel.cals+= calsBurnt;
        MainModel.heartRate+= heartRateInc;
        MainModel.data.add(new ActivisData(type, calsBurnt, heartRateInc));
    }
}