package Part2;

import java.util.Scanner;

public class numberAndSumOfNumbers {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        Integer amountOfNumbers = 0;
        Integer sumOfNumbers = 0;

            while (true){
                System.out.println("Give numbers : ");
                Integer number = reader.nextInt();
                    if(number == 0){
                        break;
                    } else {
                        amountOfNumbers++;
                        sumOfNumbers += number;

                    }
            }
        System.out.println("Number of numbers :" + amountOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);

    }


}
