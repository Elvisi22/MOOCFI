package Part4.Statistics;

import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter Numbers: ");
        while (true){
            Integer input = s.nextInt();
            if(input == -1){
                break;
            }
            if(input % 2 == 0){
                even.addNumber(input);
            }else {
                odd.addNumber(input);
            }
            statistics.addNumber(input);
        }
        System.out.println("Sum : " + statistics.sum());
        System.out.println("even " + even.sum());
        System.out.println("odd " + odd.sum());
    }
}
