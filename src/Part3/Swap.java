package Part3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
        System.out.println(Arrays.toString(array));

        System.out.println("Give two indices to swap");
        Integer index1 = s.nextInt();
        Integer index2 = s.nextInt();

        swap( array , index1 , index2);

        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array , Integer one , Integer two){
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
