package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();

        String word = one.toLowerCase();
        String word2 = two.toLowerCase();

        if(word.equals(two) || word2.equals(one)) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}
