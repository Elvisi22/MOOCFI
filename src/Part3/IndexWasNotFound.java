package Part3;

import java.util.Scanner;

public class IndexWasNotFound {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        System.out.println("Search for?");
        int number = s.nextInt();


        searchNumber(array , number);
    }

    public static void searchNumber(int[] array , int number){
        boolean found = false;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == number){
                System.out.println( number + " is at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(number + " not found ");
        }

    }
}
