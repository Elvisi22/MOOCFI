package Part1;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Value of the gift");

        Integer input  = reader.nextInt();

        if(input >= 5000 && input < 25000){
            System.out.println("tax: " + (100+(input-5000)*0.8));
        } else if (input >= 25000 && input < 55000){
            System.out.println("tax: " + (1700+(input-25000)*0.1));
        } else if (input >= 55000 && input < 200000) {
            System.out.println("tax: " + (4700 + (input - 55000) * 0.12));

        }else if (input >= 200000 && input < 1000000) {
            System.out.println("tax: " + (22100 + (input - 200000) * 0.15));

        }else if (input > 1000000 ) {
            System.out.println("tax: " + (142100 + (input - 1000000) * 0.17));

        }else {
            System.out.println("No tax");
        }
    }


}
