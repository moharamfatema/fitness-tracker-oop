package Model;
import MainSrc.ActivisData;
import MainSrc.Controller;

public class Activity {

    private final String type;
    private final int calsPerMin; //calories burnt per minute
    private final double heartIncRate;
    private double heartRateInc = 0;
    private int calsBurnt = 0;

    public Activity(String type, int calsPerMin, double heartIncRate) {
        this.type = type;
        this.calsPerMin = calsPerMin;
        this.heartIncRate = heartIncRate;
    }

    public void add(int time)
    {
        heartRateInc = MainModel.heartRate*(double) time*heartIncRate;
        calsBurnt = time*calsPerMin;
        MainModel.cals+= calsBurnt;
        MainModel.heartRate+= heartRateInc;
        MainModel.data.add(new ActivisData(type,calsBurnt,heartRateInc));
    }

    public int getCalsBurnt() {
        return calsBurnt;
    }
}