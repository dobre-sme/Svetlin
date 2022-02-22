package LoopsNested;

import java.util.Scanner;

public class LoopsNested10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter even number: ");
        String input = scanner.nextLine();

        while (!input.isEmpty()) {
            try {
                int n = Integer.parseInt(input);
                if (n % 2 == 0) {
                    System.out.println("Even number is: " + n);
                    return;
                } else {
                    System.out.println("Invalid Number!");
                }
            } catch (NumberFormatException ignored) {
                System.out.println("Invalid Number!");
            }
            input = scanner.nextLine();
        }
    }
}
