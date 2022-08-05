package Part2;

import java.util.Scanner;

public class RepeatingBreakingRemembering {
  public static void main(String[]args){
      Scanner reader = new Scanner(System.in);
      Integer sum = 0;
      Integer even = 0 ;
      Integer odd = 0;
      Integer numbers = 0;

      while (true){
          Integer input = reader.nextInt();
          if(input == -1){
              System.out.println("Thanks bye");
              break;
          }else if(input %2 == 0){
              even++;
              numbers++;
              sum+= input;
          } else {
              odd++;
              numbers++;
              sum+=input;

          }
      }
      System.out.println("sum: " + sum);
      System.out.println("numbers " + numbers);
      System.out.println("average " + ((1.0)*sum/numbers));
      System.out.println("even " + even);
      System.out.println("odd " + odd);



  }
}
