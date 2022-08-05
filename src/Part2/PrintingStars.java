package Part2;

public class PrintingStars {
    public static void printStars(int number) {

        for (int i = 0; i < number; i++) {
            System.out.print("*");

        }
    }

    public static void printSquare(int size){
        int row = 0;
        while (row<size){
            printStars(size);
            System.out.println("");
            row++;
        }
    }

    public static void printRectangle(int width, int height){
        int row = 0 ;
        while(row< height){
            printStars(width);
            System.out.println("");
            row++;
        }


    }

    public static void printTriangle(int size){
        int stars = 0;
        int row = 0;
        while (row<=size){
            printStars(stars);
            System.out.println("");
            stars++;
            row++;
        }

    }

    public static void main(String[] args) {
        printTriangle(4);
    }

}
