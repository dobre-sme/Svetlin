package Coding101;

import java.util.Scanner;

public class Coding101Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();

            if (i % 3 == 0) {
                sum1 += a;
            } else if (i % 3 == 1) {
                sum2 += a;
            } else if (i % 3 == 2) {
                sum3 += a;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
