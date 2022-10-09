package Part4.Agent;

public class Agent {
    private String name;
    private String lastName;

    public Agent(String name , String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String toString(){
        return "my name is " + this.name +
                ", " + lastName + " "+ this.name;
    }
}
