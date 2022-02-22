package Loops;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNum = scanner.nextInt();
        int max = -1000000;

        for (int i = 0; i < numOfNum; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
