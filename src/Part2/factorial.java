package Part2;

import java.util.Scanner;

public class factorial {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        Integer start = 1;
        Integer end = reader.nextInt();
        Integer sum = 1;
        for(int i = start ; i <= end ; i++){
            sum *= i;
        }
        System.out.println("The sum is :" + sum);

    }





}
