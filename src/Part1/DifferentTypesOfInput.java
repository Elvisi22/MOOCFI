package Part1;

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a string");
        String text = reader.nextLine();
        System.out.println("Give an integer");
        Integer value = reader.nextInt();

        System.out.println("Give a double");
        Double value2 = reader.nextDouble();
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Give a boolean");
        boolean bln = Boolean.valueOf(reader2.nextLine());
        System.out.println("You gave the string " + text);
        System.out.println("you gave the integer " + value);
        System.out.println("you gave the double " + value2);
        System.out.println("you gave the boolean " + bln);

    }

}
