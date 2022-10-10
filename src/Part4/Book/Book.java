package Part4.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Main> books = new ArrayList<>();
        while (true){
            System.out.println("Title");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages");
            Integer pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication Year");
            Integer year = Integer.parseInt(scanner.nextLine());

            books.add(new Main(title,pages,year));

        }
        System.out.println("What information do you want to print?");
        String printThis = scanner.nextLine();
        for(Main book : books ){
            if(printThis.equals("name")){
                System.out.println(book.getName());
            } else if (printThis.equals("everything")) {
                System.out.println(book.toString());
            }
        }
    }
}
