package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter words  , press enter to quit");


        while (true){
            String word = s.nextLine();
            if(word.isEmpty()){
                System.out.println(list.get(2));
                break;
            } else{
                list.add(word);
            }
        }



    }
}
