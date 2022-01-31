package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String kilometers = scanner.nextLine();
        double km = Double.parseDouble(kilometers);
        String dayOrNight = scanner.nextLine();

        double[] taxi = {0.70,0.79,0.90};
        double bus = 0.09;//// MIN 20 km
        double train = 0.06;//// MIN 100 km

        if(dayOrNight.equals("day") && km < 20){
            double price = taxi[0]+(taxi[1]*km);
            System.out.println(price);
        }
        else if(dayOrNight.equals("night") && km < 20){
            double price = taxi[0]+(taxi[2]*km);
            System.out.println(price);
        }
        else if(dayOrNight.equals("day") || dayOrNight.equals("night") && km > 20 && km <= 100){
            double price = bus * km;
            System.out.println(price);
        }

        else if(dayOrNight.equals("day") || dayOrNight.equals("night") && km >100){
            double price = train * km;
            System.out.println(price);
        }
    }
}
