package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            Integer input = s.nextInt();
            if(input.equals(0)){
                System.out.println(numbers.get(1)+numbers.get(2));
            }else {
                numbers.add(input);
            }
        }
    }

}
