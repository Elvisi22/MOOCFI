package Part6.HeightOrder;

import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;

public class Room {
    private ArrayList<Person> people = new ArrayList<>();

    public void add(Person person){
        this.people.add(person);
    }

    public boolean isEmpty(){
        if(people.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public ArrayList<Person> getPersons(){
        return people;
    }

    public Person shortest(){
        if(people.isEmpty()){
            return null;
        }

        Person shortestPerson = new Person("" , MAX_VALUE);
        for(Person person : people){
            if(person.getHeight() < shortestPerson.getHeight()){
                shortestPerson = person ;
            }

        }
        return shortestPerson ;
    }

    public Person take(){

        if(people.isEmpty()){
            return null;
        }

        Person shortestPerson = new Person("" , MAX_VALUE);
        for(Person person : people){
            if(person.getHeight() < shortestPerson.getHeight()){
                shortestPerson = person ;
            }

        }
       people.remove(shortestPerson);
       return shortestPerson;
    }



}
