package Part1;

import java.util.Scanner;

public class SumofTwoNumbers {


    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);

        System.out.println( "Give the first number ");

        int first = reader.nextInt();

        System.out.println("Give the second number ");

        int second = reader.nextInt();

        System.out.println("the sum of the numbers is " + ( first + second));
    }




}
