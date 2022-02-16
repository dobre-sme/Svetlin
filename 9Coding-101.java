package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if(j%2==1){
                System.out.print("*");
                }else{
                System.out.print("_");
                }
            }
            System.out.println();
        }

        for (int i = n-1; i >=1 ; i--) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j >=1 ; j--) {
                if(j%2==1){
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
