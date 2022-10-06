package Part3;

public class PrintInStars {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for(int i = 0 ; i< array.length ; i++){
            int howManyStars = array[i];
            System.out.println("");
            for (int j = 0; j < howManyStars; j++) {
                System.out.print("*");


            }


        }
    }
}
