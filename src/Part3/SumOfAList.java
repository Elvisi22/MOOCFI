package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            Integer userInput = s.nextInt();
            if(userInput.equals(-1)){
                System.out.println("Sum : " + sum(numbers));
                break;
            }else {
                numbers.add(userInput);
            }
        }


    }

    public static Integer sum(ArrayList<Integer> arrayList){
        int sum = 0;
        for(Integer x : arrayList){
            sum += x;
        }
        return sum;
    }

}
