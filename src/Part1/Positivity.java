package Part1;

import java.util.Scanner;

public class Positivity {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number");

        Integer number = reader.nextInt();

        if(number < 0){
            System.out.println("The number is not positive");
        }else{
            System.out.println("The number is positive");
        }



    }
}
