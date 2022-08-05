package Part2;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Last Number");
        Integer lastNumber = reader.nextInt();
        Integer sum = 0;
        for(int i = 0 ; i <= lastNumber ; i++){
            sum += i;

        }
        System.out.println("The sum is: " + sum);
    }
}
