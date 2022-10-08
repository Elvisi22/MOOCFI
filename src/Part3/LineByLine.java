package Part3;

import java.util.Scanner;

public class LineByLine {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.nextLine();
        String[] array = input.split(" ");
        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }
}
