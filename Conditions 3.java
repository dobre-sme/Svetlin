package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",};


        System.out.println("Input: ");
        int input = scanner.nextInt();

        if(input<=10){

            System.out.println(words[input%10]);

        }else {
            System.out.println("number is too big");
        }
