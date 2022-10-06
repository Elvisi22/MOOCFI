package Part3;

import java.util.Scanner;

public class PrintNeatly {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {5,1,3,4,2};
        printNeatly(array);
    }
    public static void printNeatly(int[] array){
        for(int i = 0; i <= array.length-1 ; i++){
            if( i == array.length -1){
                System.out.println(array[array.length-1]);
            }else{
                System.out.print(array[i]+", ");
            }
        }
    }
}
