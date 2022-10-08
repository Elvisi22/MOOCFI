package Part3;

import java.util.Scanner;

public class PersonalDetailsSecond {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String LongestName = null;
        Integer AverageOfBirthYears = 0;
        Integer count = 0;
        Integer length = 0;
        Integer sum = 0;
        String input = s.nextLine();
        personalDetails( sum, length ,AverageOfBirthYears , count , LongestName);
    }

    private static void personalDetails(Integer sum ,
                                        Integer length ,
                                        Integer averageOfBirthYears,
                                        Integer count,
                                        String longestName) {
        while (true){
            String input = s.nextLine();
            if(input.equals("")){
                break;
            }
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            averageOfBirthYears = (sum/count);
            int lengthOfWord = parts[0].toCharArray().length;
            if(length < lengthOfWord){
                length = lengthOfWord;
                longestName = parts[0];

            }

        }
        System.out.println("The Longest name " + longestName);
        System.out.println("The average of birth years " + averageOfBirthYears);


    }

}
