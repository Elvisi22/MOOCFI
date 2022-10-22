package Part6.SantaWorkShop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package(){

    }
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    public int totalWeight(){
        int totalG = 0;
        for(Gift g : gifts){
            totalG += g.getWeight();
        }
        return totalG;
    }
}
