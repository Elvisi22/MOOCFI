package Part2;

import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int negativeNumbers = 0;

        while(true){
            System.out.println("Give a number");
            Integer number = reader.nextInt();
            if(number == 0){
                break;
            } else if (number< 0) {
                negativeNumbers++;

            }
        }
        System.out.println("Number of negatives :" + negativeNumbers);



    }





}
