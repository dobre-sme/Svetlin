package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> tokens = new ArrayList<>();//Create a new empty list for the results.


        System.out.println("Enter lists:  ");
        String[] input = scanner.nextLine().split("\\|");//Split the input by ‘|’ into array of tokens.

        // 1 2 3 |4 5 6 |  7  8  //

        for (int i = input.length - 1; i >= 0; i--) {
            String[] finalTry = input[i].split("\\s+");
            for (String c : finalTry) {
                if (!c.isBlank()) {
                    tokens.add(c);
                }

            }

        }

        for (String token : tokens) {

            System.out.print(token + " ");
        }


    }


}
