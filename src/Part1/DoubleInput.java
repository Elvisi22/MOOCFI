package Part1;

import java.util.Scanner;

public class DoubleInput {

    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number");


        Double value = reader.nextDouble();

        System.out.println("You gave the double " + value);



    }


}
