package Part3;

import java.util.Scanner;

public class FirstWords {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            String input = s.nextLine();
            if(input.equals("")){
                break;
            }
            split(input);
        }

    }

    public static void split(String input){
        String[] args = input.split(" ");
        System.out.println(args[0]);
    }

}
