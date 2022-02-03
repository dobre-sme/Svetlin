package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String input =scanner.nextLine();
        String praznika = scanner.nextLine();
        String homedays = scanner.nextLine();
        double p = Double.parseDouble(praznika);
        double h = Double.parseDouble(homedays);

        double totalWeekEnds = 48 - h;
        double playSofia = totalWeekEnds*0.75;
        double playHome = p*0.66;
        
        int totalGames = (int) Math.floor(playSofia+playHome+h);
        int totalgamesN = (int) Math.floor(totalGames*1.15);

        if (input.equals("leap")){
            System.out.println(totalgamesN);
        }else{
            System.out.println(totalGames);
        }

    }
}
