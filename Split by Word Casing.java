package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lowerCase = new ArrayList<>();
        List<String> mixedCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();

        System.out.println("Input :  ");

        String[] input = Arrays.stream(scanner.nextLine().split("[,;:.!\" ]")).filter(x -> !x.isBlank())
                .collect(Collectors.toList()).toArray(String[]::new);


        for (int i = 0; i < input.length; i++) {

            String value = input[i];
            boolean lowerCaseBool = true;
            boolean upperCaseBool = true;
            boolean isDigit = true;

            //convert String to char array
            char[] charArray = value.toCharArray();

            for (int j = 0; j < charArray.length; j++) {

                if (!Character.isUpperCase(charArray[j])) {
                    upperCaseBool = false;
                }
            }

            for (int j = 0; j < charArray.length; j++) {
                if (!Character.isLowerCase(charArray[j])) {
                    lowerCaseBool = false;
                }
            }

            for (int j = 0; j < charArray.length; j++) {
                if (!Character.isDigit(charArray[j])) {
                    isDigit = false;

                }
            }

            if (isDigit ) {
                mixedCase.add(value);
            }else if (lowerCaseBool) {
                lowerCase.add(value);
            }else if (upperCaseBool){
                upperCase.add(value);
            }else {
                mixedCase.add(value);
            }

        }


        System.out.println("Lower-case:"+" "+lowerCase);
        System.out.println("Mixed-case:"+" "+mixedCase);
        System.out.println("Upper-case:"+" "+upperCase);
    }




    private static boolean isStringUpperCase(String str) {
        boolean upperCase = true;
        //convert String to char array
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            //if any character is not in upper case, return false
            if (!Character.isUpperCase(charArray[i])) {

                upperCase = false;
            }
        }

        return true;
    }

    private static boolean isStringLowerCase(String str) {
        boolean lowerCase = true;

        //convert String to char array
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            //if any character is not in lower case, return false
            if (!Character.isLowerCase(charArray[i])) {

                lowerCase = false;
            }
        }

        return true;

    }

    private static boolean isDigit(String str) {
        boolean digit = true;

        //convert String to char array
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            //if any character is not in lower case, return false
            if (!Character.isDigit(charArray[i])) {

                digit = false;
            }
        }

        return true;

    }
}
