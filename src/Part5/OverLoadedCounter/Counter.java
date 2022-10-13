package Part5.OverLoadedCounter;

public class Counter {
    private int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }

    public  Counter(){
        this.startValue = 0;
    }

    public int value(){
        return startValue;
    }
    public void increase(){
        this.startValue = startValue + 1;
    }
    public void decrease() {
        if (startValue > 0) {
            this.startValue = startValue - 1;
        }
    }

    public void increase(int increaseBy){
        this.startValue = startValue + 10;
    }
    public void decrease(int decreaseBy){
        if(this.startValue > 10){
            this.startValue = startValue -10;
        }
    }
}
