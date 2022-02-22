package LoopsNested;

import java.util.Scanner;

public class LoopsNested1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i = input; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
