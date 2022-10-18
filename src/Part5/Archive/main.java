package Part5.Archive;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        while (true){
            System.out.println("Identifier");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name?");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Archive newArch = new Archive(identifier , name);
            if(archive.contains(newArch)){

            }else {
                archive.add(newArch);
            }
        }
        System.out.println("Item\n" +
                "-----------------------");
        for(int i = 0 ; i < archive.size() ; i++){
            System.out.println(archive.get(i));
        }
    }
}
