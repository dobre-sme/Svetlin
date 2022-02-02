package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOfNum = scanner.nextDouble();

        double oddMax = Double.NEGATIVE_INFINITY;
        double oddMin = Double.MAX_VALUE;
        double oddSum = 0.0;

        double evenMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.MAX_VALUE;
        double evenSum = 0.0;


        for (double i = 1; i <= numOfNum; i++) {
            double num = scanner.nextDouble();

            if (i % 2 == 0) {
                evenSum += num;
                if (num < evenMin) {
                    evenMin = num;
                }
                else if (num > evenMax) {
                    evenMax = num;
                }
                if (evenMin > evenMax) {
                    evenMax = evenMin;
                }
            }
            else {
                oddSum += num;
                if (num < oddMin) {
                    oddMin = num;
                }
                else if (num > oddMax) {
                    oddMax = num;
                }
                if (oddMin > oddMax) {
                    oddMax = oddMin;
                }
            }
        }

        System.out.println("OddSum: " + oddSum);
        if(oddMin != Double.MAX_VALUE){
            System.out.println("OddMin: " + oddMin);
        }else{
            System.out.println("OddMin: No");
        }
        if(oddMax != Double.NEGATIVE_INFINITY){
            System.out.println("OddMax: " + oddMax);
        }else{
            System.out.println("OddMax: No");
        }


        System.out.println("EvenSum: " + evenSum);
        if(evenMin != Double.MAX_VALUE){
            System.out.println("EvenMin: " + evenMin);
        }else{
            System.out.println("EvenMin: No");
        }
        if(evenMax != Double.NEGATIVE_INFINITY){
            System.out.println("EvenMax: " + evenMax);
        }else{
            System.out.println("EvenMax: No");
        }
    }
}
