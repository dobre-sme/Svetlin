package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();


        if (Objects.equals(type,"square")) {
            int a = scanner.nextInt();
            int s =a*a;
            System.out.println(s);
        }
        if (Objects.equals(type,"rectangle")) {
            double a =scanner.nextDouble();
            double b =scanner.nextDouble();
            double s = a * b;
            System.out.println(s);

        }
        if (Objects.equals(type,"circle")) {
            double r = scanner.nextDouble();
            double s = 3.14159 * (r*r);
            System.out.printf("%.03f",s);
        }
        if (Objects.equals(type,"triangle")) {
            double c =scanner.nextDouble();
            double h =scanner.nextDouble();
            double s = (c*h)/2;
            System.out.printf("%.0f",s);

        }
        
    }
}
