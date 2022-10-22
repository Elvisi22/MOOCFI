package Part6.CargoHold;

import java.util.ArrayList;

public class SuitCase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;


    public SuitCase(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String toString() {
        if (items.isEmpty()) {
            return 0 + " items " + "(0 kg)";

        }
        int totalWeight = 0;
        int size = items.size();
        for (Item item : items) {
            totalWeight += item.getWeight();
            if(totalWeight > this.maxWeight){
                totalWeight = totalWeight - item.getWeight();
                size--;
            }
        }
            return size + " items " + totalWeight + " kg";
        }


        public void printItems(){
            System.out.println(items);
        }

        public int totalWeight(){
        int totalW = 0;
        for(Item item : items){
            totalW += item.getWeight();
        }
        return totalW;
        }


        public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item W = new Item("" , 0);
        for(Item e : items){
            if(W.getWeight() < e.getWeight()){
                W = e;
            }
        }
            return W;
        }




}
