package Part3;

import java.util.Scanner;

public class LastWords {
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
        String[] array  = input.split(" ");
        System.out.println(array[array.length-1]);
    }
}
