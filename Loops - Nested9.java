package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int result = (int) Math.sqrt(input);

        while (result * result == input) {
            System.out.println("Not Prime");
            return;
        }
        System.out.println("Prime");
    }
}
