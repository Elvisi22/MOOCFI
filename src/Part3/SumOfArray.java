package Part3;

import java.util.Scanner;

public class SumOfArray {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println(sumOfArray(array));
    }
    public static int sumOfArray(int[] array){
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        return sum;
    }
}
