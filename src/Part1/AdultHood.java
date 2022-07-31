package Part1;

import java.util.Scanner;

public class AdultHood {

    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("how old are your");
        Integer input = reader.nextInt();
        if(input > 18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }



    }
}
