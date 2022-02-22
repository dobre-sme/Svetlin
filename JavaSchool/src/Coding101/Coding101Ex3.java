package Coding101;

import java.util.Scanner;

public class Coding101Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt(), second = scanner.nextInt(), point = scanner.nextInt(),
                ds = Math.min(first, second), db = Math.max(first, second),
                distance1 = Math.abs(point - ds), distance2 = Math.abs(point - db);

        boolean in = (first < point && point < second) || (first > point && point > second);

        if (in) {
            System.out.print("in" + "\n" + Math.min(distance1, distance2));
        } else {
            System.out.print("out" + "\n" + Math.min(distance1, distance2));
        }
    }
}
