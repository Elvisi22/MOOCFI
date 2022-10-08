package Part3;

import java.util.Scanner;

public class AVclub {
    public static Scanner s = new Scanner(System.in);

   public static void main(String[] args) {
        String input = s.nextLine();
        split(input);
    }

    public static void split(String input){
        String[] array = input.split(" ");
        for(int i = 0; i < array.length ; i++){
            if(array[i].contains("av")){
                System.out.println(array[i]);
            }
        }
    }


}
