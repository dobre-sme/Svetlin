package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String age = scanner.nextLine();
        double a = Double.parseDouble(age);
        String gender = scanner.nextLine();

        if(gender.equals("m") && a >= 16){
            System.out.println("Mr.");
        }else if (gender.equals("m") && a < 16){
            System.out.println("Master");

        }else if(gender.equals("f") && a >= 16){
            System.out.println("Ms.");
        }else if (gender.equals("f") && a < 16){
            System.out.println("Miss");
        }
    }
}
