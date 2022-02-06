package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Еnter a number in the range [1...100]: ");
        int input = scanner.nextInt();

        while (input < 1 || input > 100 ) {
            System.out.println("Invalid number!");
             input = scanner.nextInt();
        }
        System.out.println("The number is: " + input);
    }
}
