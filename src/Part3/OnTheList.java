package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String input = s.nextLine();
            if(input.isEmpty()){
                search(list);
                break;
            }else {
                list.add(input);
            }
        }
    }
    public static void search(ArrayList<String> arrayList){
        System.out.println("Search for ? ");
        String input = s.nextLine();

            if(arrayList.contains(input)){
                System.out.println( input + " was found ! ");
            }else{
                System.out.println( input + " was not found! ");
        }

    }
}
