package Part1;

import java.util.Scanner;

public class Ancient {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a year");
        Integer input = reader.nextInt();
        if(input < 2015){
            System.out.println("Ancient History");
        }


    }
}
