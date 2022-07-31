package Part1;

import java.util.Scanner;

public class SppedingTicket {

    public static void main(String[]args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a speed");

        int speed = reader.nextInt();

        if(speed > 120){
            System.out.println("Speeding ticket");
        }
        System.out.println("");


    }





}
