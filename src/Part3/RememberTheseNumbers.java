package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            Integer input = s.nextInt();
            if(input.equals(-1)){
                for(int i = 0; i< numbers.size(); i++){
                    System.out.println(numbers.get(i));
                }
                break;
            }else{
                numbers.add(input);
            }
        }
    }
}
