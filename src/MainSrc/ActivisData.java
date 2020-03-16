package MainSrc;

public class ActivisData {

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
}
