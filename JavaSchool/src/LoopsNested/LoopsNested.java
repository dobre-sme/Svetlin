package LoopsNested;

import java.util.Scanner;

public class LoopsNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i = 1; i <= input; i += 3) {
            System.out.println(i);
        }
    }
}
