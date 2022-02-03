package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startExamHour = scanner.nextInt();
        int startExamMinutes = scanner.nextInt();
        int comeHour = scanner.nextInt();
        int comeMinutes = scanner.nextInt();

        int examTime = startExamHour * 60 + startExamMinutes;
        int comeTime = comeHour * 60 + comeMinutes;
        int minutesDifference = comeTime - examTime;
        int hours = Math.abs(minutesDifference / 60);
        int minutes = Math.abs(minutesDifference % 60);

        if (minutesDifference < -30) {
            System.out.println("Early");
        }
        else if (minutesDifference < 0) {
            System.out.println("On time");
        }
        else if (minutesDifference == 0) {
            System.out.println("On time");
        }
        else {
            System.out.println("Late");
        }

        if (hours > 0)
        {
            if (minutes < 10)
            {
                System.out.println(hours + ":0" + minutes + " hours");
            }
            else
            {
                System.out.println(hours + ":" + minutes + " hours");
            }
        }
        else
        {
            System.out.println(minutes + " minutes");
        }

        if (minutesDifference < 0)
        {
            System.out.println(" before the start");
        }
        else
        {
            System.out.println(" after the start");
        }
    }
}
