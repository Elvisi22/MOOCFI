package Part2;

import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        Integer totalNumbers = 0;

        while(true){
            System.out.println("Give a number");
            Integer input = reader.nextInt();


            if(input == 0){
                break;
            }else{
                totalNumbers++;
                continue;
            }

        }

        System.out.println("Number of numbers: " +totalNumbers);

    }

}
