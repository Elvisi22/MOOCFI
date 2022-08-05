package Part2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.println("Give a nnumber");
            Integer input = reader.nextInt();
            if(input ==0){
                break;
            } else if (input<0) {
                System.out.println("Unsuitable number");

            } else if (input>0) {
                System.out.println(input*input);

            }
        }


    }


}
