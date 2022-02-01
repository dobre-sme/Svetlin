package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNum = scanner.nextInt();
        int result1 =0;
        int result2 =0;

        for (int i = 0; i < numOfNum; i++) {
            int num1 = scanner.nextInt();
            result1 = result1+num1;

        }
        for (int i = 0; i <numOfNum ; i++) {
            int num2 = scanner.nextInt();
            result2 = result2+num2;

        }

        int resultDiff = Math.abs(result1 - result2);
        if (result1 == result2) {
            System.out.println("Yes, sum = "+result1);
        }else{
            System.out.println("No, diff = " + resultDiff);
        }
    }
}
