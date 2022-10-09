package Part4.Guage;

public class Guage {
    private int value;

    public Guage(){
        this.value = 0;
    }

    public void increase(){
        this.value = value+1;
    }
    public void decrease(){
        this.value = value - 1;
    }
    public int value(){
        return this.value;
    }
    public boolean full(){
        if(value == 5){
            return true;
        }
        return false;
    }
}
