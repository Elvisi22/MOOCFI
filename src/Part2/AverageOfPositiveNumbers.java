package Part2;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        Integer positiveNumbers = 0;
        Integer sumOfNumbers = 0;

            while(true){
                Integer number = reader.nextInt();
                if(number == 0){
                    break;
                } else if (number > 0) {
                    positiveNumbers++;
                    sumOfNumbers+= number;

                }
            }
        System.out.println(sumOfNumbers/positiveNumbers);

    }
}
