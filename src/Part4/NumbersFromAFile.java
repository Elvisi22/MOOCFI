package Part4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File?");
        String file = scanner.nextLine();

        System.out.println("Lower bound");
        Integer lower = scanner.nextInt();

        System.out.println("Upper bound");
        Integer upper = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null){
            numbers.add(Integer.parseInt(str));
        }
        int numbersCount = 0;
        for(Integer e : numbers){
            if(e >= lower && e <= upper){
                numbersCount++;
            }
        }
        System.out.println(numbersCount);

    }
}
