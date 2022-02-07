package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int n =1;
        
        for (int i = 1; i <input+1 ; i++) {
            n=i*n;
        }
        System.out.println(n);
    }
}
