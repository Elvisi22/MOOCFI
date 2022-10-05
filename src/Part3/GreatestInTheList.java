package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInTheList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean indicator = true;

        while (indicator){
            Integer number = s.nextInt();
            if(number.equals(-1)){
                printLargestNumber(numbers);
                indicator =false;
            }else{
                numbers.add(number);
            }
        }
    }

    public static void printLargestNumber(ArrayList<Integer> arrayList){
        int maximum = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (maximum < arrayList.get(i))
                maximum = arrayList.get(i);
        }
        System.out.println(maximum);

    }

}
