package Part3;

import java.util.Scanner;

public class printThrice {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a word\n");
        String input = s.nextLine();
        System.out.println(input.repeat(3));
    }
}
