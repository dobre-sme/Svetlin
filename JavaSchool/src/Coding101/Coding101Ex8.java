package Coding101;

import java.util.Scanner;

public class Coding101Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int na = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a > na) {
                count++;
            }
            na = a;
        }
        System.out.println(count);
    }
}
