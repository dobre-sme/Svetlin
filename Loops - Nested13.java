package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input : ");
        int n = Integer.parseInt(scanner.next());


        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                int num = i+j+1;
                if(num>n){

                    num = n*2 - num;
                }
                System.out.print(num+" ");
            }
            System.out.println();
        }


    }
}
