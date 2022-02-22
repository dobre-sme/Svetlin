package Coding101;

import java.util.Scanner;

public class Coding101Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n * 2; i++) {
            System.out.print("%");
        }
        int numRows = n;
        if (n % 2 == 0) {
            numRows--;
        }
        System.out.println();
        for (int i = 0; i < numRows; i++) {

            System.out.print("%");
            if (i == numRows / 2) {
                System.out.print(repeater(" ", n - 2));
                System.out.print("**");
                System.out.print(repeater(" ", n - 2));
            } else {
                System.out.print(repeater(" ", n * 2 - 2));
            }
            System.out.print("%");
            System.out.println();
        }

        for (int i = 0; i < n * 2; i++) {
            System.out.print("%");
        }
    }

    static String repeater(String strToRepeat, int count) {

        return String.valueOf(strToRepeat).repeat(Math.max(0, count));
    }
}
