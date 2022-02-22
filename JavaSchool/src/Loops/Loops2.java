package Loops;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNum = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < numOfNum; i++) {
            int num = scanner.nextInt();
            result = result + num;
        }
        System.out.println(result);
    }
}
