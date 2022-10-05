package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>  list = new ArrayList<>();
        boolean indicator = true;
        while (indicator){
            Integer input = s.nextInt();
            if(input.equals(-1)){
                System.out.println("From where ?");
                Integer start = s.nextInt();
                System.out.println("to where ?");
                Integer end = s.nextInt();
                for(int i = start ; i <= end ; i++){
                    System.out.println(list.get(i));
                }
                indicator = false;
            }else {
                list.add(input);
            }


        }
    }
}
