package Part2;

import java.util.Scanner;

public class countingTo100 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int start = reader.nextInt();
        int end = 100;
        for(int i = start ; i <= end ; i++){
            System.out.println(i);
        }
    }

}
