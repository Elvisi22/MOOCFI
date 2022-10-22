package Part6.CargoHold;

import java.util.ArrayList;

public class Hold {
    private ArrayList<SuitCase> hold = new ArrayList<>();
    private int maxW;

    public Hold(int maxW){
        this.maxW = maxW;
    }

    public void addSuitcase(SuitCase suitcase){
        this.hold.add(suitcase);
    }

    public String toString(){
        int kg = 0;
        for(SuitCase s : hold){
            kg = s.totalWeight();
        }

        return hold.size() + " suitcases" + " (" + kg +")" ;
    }

    public void printItems(){
        for(SuitCase s : hold){
           s.printItems();
        }
    }
}
