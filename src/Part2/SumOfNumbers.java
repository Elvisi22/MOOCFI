package Part2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        Integer sum = 0;

        while(true){
            System.out.println("Give a number");
            Integer number = reader.nextInt();
            if(number == 0){
                break;
            }else {
                sum += number;
            }
        }

        System.out.println("The sum of numbers is: " + sum);


    }



}
