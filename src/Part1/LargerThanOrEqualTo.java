package Part1;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give the first number");
        Integer first = reader.nextInt();
        System.out.println("Give the second number");
        Integer second = reader.nextInt();
        if(first>second){
            System.out.println("The greater number is " + first);
        }else{
            System.out.println("the greatest number is " + second);
        }





    }
}
