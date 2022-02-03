package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        List<Integer>previousResult = new ArrayList<>();

        int result = 0;

        for (int i = 0; i < input; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            result = n1 + n2;
            previousResult.add(result);
        }

        int maxResult = Collections.max(previousResult);
        int minResult = Collections.min(previousResult);
        int maxDiff = maxResult - minResult;

        if (minResult == maxResult){
            System.out.println("Yes, value = " + maxResult);
        }else {
            System.out.println("No , maxDiff = " + maxDiff);
        }
    }
}
