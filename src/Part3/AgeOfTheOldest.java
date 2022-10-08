package Part3;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int largest = 0;
        String name = null;

        while (true) {
            String input = s.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if(largest < Integer.valueOf(parts[1])){
                largest = Integer.valueOf(parts[1]);
                 name = parts[0];
            }
        }

        System.out.println(largest);
        System.out.println(name);

    }


}
