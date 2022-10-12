package Part4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItOnTheFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file");
        String file = scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        while ((str = br.readLine()) != null){
            names.add(str);
        }
        System.out.println("Search for:");
        String search = scanner.nextLine();
        if(names.contains(search)){
            System.out.println("Found");
            }
        }

    }

