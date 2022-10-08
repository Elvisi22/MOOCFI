package Part3;

import java.util.Scanner;

public class PersonalDetails {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String name = null;
        Integer oldest = 0;
        while (true){
            String input = s.nextLine();
            if(input.equals("")){
                break;
            }

            String[] parts = input.split(",");
            if(oldest < Integer.parseInt(parts[1])){
                oldest = Integer.parseInt(parts[1]);
                name = parts[0];
            }
        }

        System.out.println("Age of the oldest: " + name);
    }
}
