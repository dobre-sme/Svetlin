package LoopsNested;

import java.util.Scanner;

public class LoopsNested8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int result = 0;

        while (input != 0) {

            result = result + (input % 10);
            input = input / 10;
        }
        System.out.println(result);
    }
}
