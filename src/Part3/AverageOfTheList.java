package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfTheList {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
            while (true){
                Integer userInput = s.nextInt();
                if(userInput.equals(-1)){
                    System.out.println("Average: " + average(numbers));
                    break;
                }else{
                    numbers.add(userInput);
                }
            }
    }


    public static Double sum(ArrayList<Integer> arrayList){
        double sum = 0;
        for(Integer x : arrayList){
            sum += x;
        }
        return sum;
    }

    public static Double average(ArrayList<Integer> arrayList){

        double numbers = arrayList.size();
        double average = sum(arrayList)/numbers;
        return average;
    }
}
