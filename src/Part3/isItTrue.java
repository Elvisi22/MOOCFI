package Part3;

import java.util.Scanner;

public class isItTrue {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a string\n ");
        String input = s.nextLine();
        if(input.equals("true")){
            System.out.println("You got it right");
        }else{
            System.out.println("Try again");
        }
    }
}
