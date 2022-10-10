package Part4.PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalCollection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<PersonalInformation> list = new ArrayList<>();

        while (true){
            System.out.println("Enter your name");
            String fName = s.nextLine();
            if(fName.equals("")){
                break;
            }
            System.out.println("Enter your Last Name: ");
            String lName = s.nextLine();
            System.out.println("Enter your id number: ");
            String id = s.nextLine();
            list.add(new PersonalInformation(fName,lName,id));
        }

        for(PersonalInformation e : list){
            System.out.println(e);
        }
    }
}
