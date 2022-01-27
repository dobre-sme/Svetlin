package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = new ArrayList<>();


        System.out.println("Input :  ");
        String[] input = scanner.nextLine().split(" ");

        //=====================================================//
        for (int i = 0; i < input.length; i++) {
            int numbers = Integer.parseInt(input[i]);
            listOfNumbers.add(numbers);

        }

        //=====================================================// сравнява стойностите на числата ++
        boolean hasSummed= true;

        while (hasSummed){
            hasSummed= false;

            for (int i = 1; i < listOfNumbers.size() ; i++) {  //цикъл който обхожда и сравнява

                int preveous = listOfNumbers.get(i-1);
                int current = listOfNumbers.get(i);

                if (preveous==current){
                    listOfNumbers.set(i,preveous+current);
                    listOfNumbers.remove(i-1);
                    hasSummed = true;
                }
            }
        }
        //========================================================


        for (Integer numbers : listOfNumbers) {
            System.out.print(numbers + " ");  //// Показва числата на същият ред
        }
        System.out.println();
    }
}
