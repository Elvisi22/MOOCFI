package Part2;

import java.util.Scanner;

public class Reprint {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times ?");
        Integer input = reader.nextInt();
        for (int i = 0 ; i < input ; i++){
            printText();
        }


    }
    public static void printText(){
        System.out.println("In a hole in the ground");
    }
}
