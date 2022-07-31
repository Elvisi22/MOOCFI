package Part1;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number");

        Integer first = reader.nextInt();

        System.out.println("Give the second number");

        Integer second = reader.nextInt();

        System.out.println("Give the third number");

        Integer third = reader.nextInt();

        Integer sum = first + second + third;

        System.out.println("The sum of the numbers is " + sum);




    }




}
