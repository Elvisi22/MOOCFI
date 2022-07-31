package Part1;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number");

        Integer first = reader.nextInt();

        System.out.println("Give the second number ");

        Integer second = reader.nextInt();

        System.out.println(first + " + " + second + " = " + (first+second));
        System.out.println(first + " - " + second + " = " + (first-second));
        System.out.println(first + " * " + second + " = " + (first*second));
        System.out.println(first + " / " + second + " = " + (first/second));




    }

}
