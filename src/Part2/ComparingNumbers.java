package Part2;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);

        Integer first = reader.nextInt();
        Integer second = reader.nextInt();

        if(first>second){
            System.out.println(first + " is bigger than " + second);
        }else{
            System.out.println(first + " is smaller than " + second);
        }


    }
}
