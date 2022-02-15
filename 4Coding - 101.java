package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        boolean in = (x>1 && x<13 && y>-4 && y<2) || (x>3 && x<11 && y>-6 && y<4);
        
        if(in){
            System.out.println("in");
        }else {
            System.out.println("out");
        }
    }
}
