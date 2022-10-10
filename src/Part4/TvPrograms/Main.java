package Part4.TvPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<TvProgram> programs = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Name:");
            String name = s.nextLine();
            if(name.isEmpty()){
                break;
            }

            System.out.println("Duration");
            Integer time = Integer.parseInt(s.nextLine());

            programs.add(new TvProgram(name,time));

        }

        System.out.println("Programs maximum duration?");
        Integer max = s.nextInt();

        for (TvProgram x : programs){
            if(x.getDuration() <= max){
                System.out.println(x);
            }
        }
    }
}
