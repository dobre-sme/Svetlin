package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Odd or not : ");
        int number = scanner.nextInt();
        boolean compare =true;

        if (number%2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


    }
}
