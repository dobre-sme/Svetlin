package Loops;

import java.util.Scanner;

public class Loops8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNum = scanner.nextInt();
        int largeNum = 0;
        int result = 0;


        for (int i = 0; i < numOfNum; i++) {
            int num = scanner.nextInt();
            result += num;

            if (i == 0) {
                largeNum = num;
            } else if (num > largeNum) {
                largeNum = num;
            }

        }
        int resultDiff = Math.abs(result - largeNum - largeNum);
        if (resultDiff == 0) {
            System.out.println("Yes");
            System.out.println("sum = " + largeNum);
        } else {
            System.out.println("No");
            System.out.println("diff = " + resultDiff);
        }
    }
}
