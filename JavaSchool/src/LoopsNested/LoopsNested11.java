package LoopsNested;

import java.util.Scanner;

public class LoopsNested11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Input : ");
        int n = scanner.nextInt();

        int n1 = 1;
        int n2 = 1;
        int n3 = 0;

        if (n < 2) {
            System.out.println("1");
        }

        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);
    }
}
