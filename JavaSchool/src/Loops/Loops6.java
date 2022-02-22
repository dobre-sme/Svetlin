package Loops;

import java.util.Scanner;

public class Loops6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNum = scanner.nextInt();
        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < numOfNum; i++) {
            int num = scanner.nextInt();
            if (i % 2 == 0) {
                result1 = result1 + num;
            } else {
                result2 = result2 + num;
            }
        }
        int resultDiff = Math.abs(result1 - result2);

        if (result1 == result2) {
            System.out.println("Yes");
            System.out.println("sum = " + result1);
        } else {
            System.out.println("No");
            System.out.println("diff = " + resultDiff);
        }

    }
}
