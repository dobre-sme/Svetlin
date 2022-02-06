package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int n = 0;

        while (n*2+1 <= input) {
            n = n*2 + 1;
            System.out.println(n);
        }
    }
}
