package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        boolean Go = true;
        while (Go){
            String input = s.nextLine();
            if(input.isEmpty()){
                System.out.println(list.get(0));
                System.out.println(list.get(list.size()-1));
                Go = false;
            }else{
                list.add(input);
            }
        }
    }
}
