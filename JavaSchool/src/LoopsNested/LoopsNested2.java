package LoopsNested;

import java.util.Scanner;

public class LoopsNested2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        double n = 0.5;

        for (int i = 0; i <= input; i++) {
            n = n * 2;
            System.out.printf("%.0f%n", n);
        }
    }
}
