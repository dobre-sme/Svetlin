package LoopsNested;

import java.util.Scanner;

public class LoopsNested12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input : ");
        int n = Integer.parseInt(scanner.next());
        int num = 1;

        for (int i = 0; i <= n / 2 && num <= n; i++) {
            for (int j = 0; j <= i && num <= n; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
