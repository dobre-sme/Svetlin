package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int point = scanner.nextInt();

        int ds = Math.min(first, second);
        int db = Math.max(first, second);
        int distance1 = Math.abs(point - ds);
        int distance2 = Math.abs(point - db);

        boolean in = (first < point && point < second) || (first > point && point > second);

        if (in) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        System.out.println(Math.min(distance1, distance2));
    }
}
