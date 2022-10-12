package Part4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args)  throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("file:");
        String file = scanner.nextLine();

        System.out.println("Team:");
        String team = scanner.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        List<String[]> data = new ArrayList<>();

        while ((str = br.readLine()) != null){
            String[] array = str.split(",");
            data.add(array);
        }

        int losses = 0;
        int wins = 0;
        for(String[] array : data){
            int score1 = Integer.parseInt(array[2]);
            int score2 = Integer.parseInt(array[3]);

            if(array[0].equalsIgnoreCase(team)&& score1 > score2 ||
                    array[1].equalsIgnoreCase(team) && score2 > score1){
                wins++;
            }else if(array[0].equalsIgnoreCase(team) || array[1].equalsIgnoreCase(team)){
                losses++;
            }


         }
        int games = wins+losses;
        System.out.println("Games " + games);
        System.out.println("Wins " + wins);
        System.out.println("Losess " + losses);

    }

}


