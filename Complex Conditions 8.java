package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String projection = scanner.nextLine();
        String rows = scanner.nextLine();
        String col = scanner.nextLine();
        double r= Double.parseDouble(rows);
        double c= Double.parseDouble(col);
        double total = r*c;
        double income = 0.0;

        if(projection.equals("Premiere")){
            income = total *12.00;
        }else if(projection.equals("Normal")){
            income = total*7.50;
        }else if(projection.equals("Discount")){
            income = total*5.00;
        }
        System.out.printf("%.02f",income);
    }
}
