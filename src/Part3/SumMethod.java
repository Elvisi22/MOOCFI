package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class SumMethod {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for(Integer x : numbers){
            sum += x;
        }
        return sum;
    }
}
