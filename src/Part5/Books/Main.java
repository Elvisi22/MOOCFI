package Part5.Books;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true){
            System.out.println("Name(empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Publication year");
            int year = Integer.parseInt(scanner.nextLine());
            Book nBook = new Book(name,year);
            if(books.contains(nBook)){
                System.out.println("Book already on the list");

            }else{
                books.add(nBook);
            }

        }

        System.out.println("Thank you ! Books added " + books.size());
    }
}
