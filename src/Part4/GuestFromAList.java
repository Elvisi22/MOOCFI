package Part4;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestFromAList {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null){
            list.add(str);
        }
        System.out.println("");
        System.out.println("Enter names , an empty line will quit");
        while (true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            if(list.contains(name)){
                System.out.println("The name is on the list");
            }else{
                System.out.println("The name is not on the list ");

            }
        }
        System.out.println("Thank you");


    }







    }




