package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class LastinList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true){
            String input = s.nextLine();
            if(input.isEmpty()){
                System.out.println(list.get(list.size()-1));
                break;
            }else{
                list.add(input);
            }
        }
    }
}
