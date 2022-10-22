package Part6.LongestInCollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){

        String printThis = "the collection " + this.name  + "has " + elements.size()  +" elements :" + elements;


        if(elements.isEmpty()){
            return "the elements are empty";
        }
        return  printThis;
    }

    public String longest(){
        String longest = "";
        for(String e : elements){
            if(longest.length() < e.length()){
                longest = e;
            }
        }
        return longest;
    }
}
