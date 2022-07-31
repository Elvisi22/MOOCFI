package Part1;

import java.util.Scanner;

public class VariousVariables {

    public static void main(String[]args) {


        Scanner reader = new Scanner(System.in);

        System.out.println("Chicken");

        Integer chicken = reader.nextInt();

        System.out.println("Bacon(kg)");

        Float bacon = reader.nextFloat();

        System.out.println("Tractor");

        Scanner reader2 = new Scanner(System.in);

        String tractor = reader2.nextLine();

        System.out.println("And finally a sumary");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);






    }
}
