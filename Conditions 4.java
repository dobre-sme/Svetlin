package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");

        int input = scanner.nextInt();
        double bonus =0.0;

        if (input <= 100){
            bonus = 5;
        }else if(input<= 1000){
            bonus = 0.2 * input;
        }else{
            bonus =0.1 * input;
        }
        if(input%2==0){
            bonus = bonus + 1.0;
        }else if (input%10==5){
            bonus = bonus + 2.0;
        }

        System.out.println(bonus);
        System.out.println(bonus + input);
     }
    }
