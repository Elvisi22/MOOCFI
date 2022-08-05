package Part2;

import java.util.Scanner;

public class whereTo {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);


        System.out.println("Where to ");
        int end = reader.nextInt();
        System.out.println("Where from");
        int start = reader.nextInt();
        for(int i = start ; i <= end ; i++){
            System.out.println(i);
        }
    }
}
