package Part2;

import java.util.Scanner;

public class CarryOn {

    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);



        while(true){
            System.out.println("carry on?");
            String input = reader.nextLine();
            if(input.equals("no")){
                break;
            }

        }



    }

}
