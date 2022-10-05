package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfTheSmallest {
    public  static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean indicator = true;
        while (indicator){
            Integer input = s.nextInt();
            if(input.equals(9999)){
                indicator = false;
            }else {
                numbers.add(input);
            }
        }
        System.out.println("Smallest number : " + findSmallestNumber(numbers));
        System.out.println("Found at index: " + findIndex(numbers , findSmallestNumber(numbers)));

    }



    public static Integer findSmallestNumber(ArrayList<Integer> arrayList){
        int smallest = arrayList.get(0);
        for(int i = 0 ; i < arrayList.size() ; i++){
            if(smallest > arrayList.get(i)){
                smallest = arrayList.get(i);
            }
        }
        return smallest;
    }

         public static Integer findIndex(ArrayList<Integer> arrayList , Integer input){
            int index = 0;
            for(int i = 0; i < arrayList.size() ; i++){
                if(arrayList.get(i).equals(input)){
                    index = i;
                }
            }
            return index;

         }
}
