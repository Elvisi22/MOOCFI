package Part2;

import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);
        Integer first = reader.nextInt();
        Integer second = reader.nextInt();
        int sum = first+second;
        System.out.println(Math.sqrt(sum));



    }

}
