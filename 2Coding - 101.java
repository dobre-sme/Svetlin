package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int w = scanner.nextInt();
        int m = scanner.nextInt();

        double c =(double) x/(w*m);

        System.out.printf("%.0f",Math.ceil(c));

    }
}
