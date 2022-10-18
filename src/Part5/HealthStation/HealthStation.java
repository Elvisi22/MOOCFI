package Part5.HealthStation;

public class HealthStation {

    private Person person;
    private int weighingss;

    public int weigh(Person person){
        this.weighingss++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return this.weighingss;
    }
}
