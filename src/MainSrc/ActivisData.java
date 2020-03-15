package MainSrc;

public class ActivisData {

    private static int totalCals;
    private static float heartRate;

    private String type;
    private int calsBurnt;
    private double heartRateInc;

    public ActivisData(String type, int calsBurnt, double heartRateInc) {
        this.type = type;
        this.calsBurnt = calsBurnt;
        this.heartRateInc = heartRateInc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCalsBurnt() {
        return calsBurnt;
    }

    public void setCalsBurnt(int calsBurnt) {
        this.calsBurnt = calsBurnt;
    }

    public double getHeartRateInc() {
        return heartRateInc;
    }

    public void setHeartRateInc(double heartRateInc) {
        this.heartRateInc = heartRateInc;
    }

    public static void setTotalCals(int totalCals) {
        ActivisData.totalCals = totalCals;
    }

    public static void setHeartRate(float heartRate) {
        ActivisData.heartRate = heartRate;
    }

    public static int getTotalCals() {
        return totalCals;
    }

    public static float getHeartRate() {
        return heartRate;
    }
}
