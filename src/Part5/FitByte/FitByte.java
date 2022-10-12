package Part5.FitByte;

public class FitByte {

    private int age;
    private int restingHeartRate;

    public FitByte(int age , int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRare = 206.3 - (0.711 * age);
        return (maxHeartRare-restingHeartRate)*(percentageOfMaximum)+restingHeartRate;
    }
}
