package com.company;

import com.sun.jdi.Value;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersIn = new LinkedList<>();


        System.out.println("Input : ");

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            int value = Integer.parseInt(input[i]);

            numbersIn.add(value);



        }
        Collections.sort(numbersIn);

        for (int i = 0; i < numbersIn.size(); i++) {

            int keypoint = numbersIn.get(i);
            if (i==numbersIn.size()-1){
                System.out.print(keypoint);
            }else{System.out.print(keypoint + "<=");

            }


        }
    }
}
