package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        if((minutes + 15) > 60){
            minutes = (minutes + 15) % 60;
            hours++;
        }
        else if(minutes + 15 < 60){
            minutes = minutes + 15;
        }
        if((hours + 1) > 24){
            hours = hours%24;
        }

        String seconds_string = String.format("%02d",minutes%60);
        System.out.println(hours + ":" +seconds_string);
    }
}
