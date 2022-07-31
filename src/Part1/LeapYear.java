package Part1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Give a year");
        Integer input = reader.nextInt();
        if(input % 4 == 0){
            System.out.println("This is a lap year");
        }else{
            System.out.println("this is not a lap year");
        }




    }

}
