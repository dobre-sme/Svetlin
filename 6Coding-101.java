package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a<=b && a+b==c){
            System.out.println(a+"+"+b+"="+c);
        }else{
            System.out.println("No");
        }
    }
}
