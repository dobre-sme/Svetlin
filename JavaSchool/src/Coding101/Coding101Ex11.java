package Coding101;

import java.util.Scanner;

public class Coding101Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), count = 0;

        for (int i = a; i <= b; i++) {
            for (int j = i + 1; j <= b; j++) {
                for (int k = j + 1; k <= b; k++) {
                    for (int l = k + 1; l <= b; l++) {
                        System.out.printf("%d %d %d %d %n", i, j, k, l);
                        count++;

                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        }
    }
}
