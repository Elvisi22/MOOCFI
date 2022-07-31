package Part1;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);
        System.out.println("How many days would you like to convert into seconds?");
        Integer value = reader.nextInt();
        int secondsperday = 86400;

        System.out.println(value*secondsperday);






    }





}
