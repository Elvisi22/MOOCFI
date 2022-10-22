package Part6.Stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;

    public Stack(){
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(stacks.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
        stacks.add(value);
    }
    public ArrayList<String> values(){
        return stacks;
    }

    public String take(){
        String lastChar = stacks.get(stacks.size()-1);
        stacks.remove(stacks.get(stacks.size()-1));
        return lastChar;
    }
}
