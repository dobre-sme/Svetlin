package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {

            if( input.charAt(i) == 'a'){
               result += 1;
            }
            else if (input.charAt(i) == 'e'){
                result += 2;
            }
            else if (input.charAt(i) == 'i'){
                result += 3;
            }
            else if (input.charAt(i) == 'o'){
                result += 4;
            }
            else if (input.charAt(i) == 'u'){
                result += 5;
            }

        }
        System.out.println(result);
    }
}
