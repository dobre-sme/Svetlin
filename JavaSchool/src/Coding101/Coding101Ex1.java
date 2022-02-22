package Coding101;

import java.util.Scanner;

public class Coding101Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        y2 = y3;
        int a = x2 - x3;
        int h = y3 - y1;
        double s = (double) a * h / 2;
        System.out.println(s);
    }
}
