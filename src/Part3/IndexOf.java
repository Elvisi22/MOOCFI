package Part3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean indicator = true;
        while (indicator){
            Integer input = s.nextInt();
            if(input.equals(-1)){
                indicator = false;
            }else{
                numbers.add(input);
            }
        }
        System.out.println("Search for? ");
        int number = s.nextInt();
        findIndex(numbers , number);
    }

    public static void findIndex(ArrayList<Integer> arrayList , Integer input){
        int position = 0;
        for(int i = 0 ; i < arrayList.size() ; i++) {
            if (arrayList.get(i).equals(input)) {
                position = i;
                System.out.println(input + " is at index " + position);

            }
        }
    }

}
