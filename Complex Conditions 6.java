package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = scanner.nextDouble();
        double price =0.0;

        if((day.equals("Monday")) || (day.equals("Tuesday")) || (day.equals("Wednesday")) ||
                (day.equals("Thursday"))|| (day.equals("Friday"))){
            if (fruit.equals("banana")){
                price = 2.50*quantity;
            }else if (fruit.equals("apple")){
                price = 1.20*quantity;
            }else if (fruit.equals("orange")){
                price = 0.85*quantity;
            }else if (fruit.equals("grapefruit")){
                price = 1.45*quantity;
            }else if (fruit.equals("kiwi")){
                price = 2.70*quantity;
            }else if (fruit.equals("pineapple")){
                price = 5.50*quantity;
            }else if (fruit.equals("grapes")){
                price = 3.85*quantity;
            }

        }else if((day.equals("Saturday")) || (day.equals("Sunday"))){
            if (fruit.equals("banana")){
                price =2.70*quantity;
            }else if (fruit.equals("apple")){
                price =1.25*quantity;
            }else if (fruit.equals("orange")){
                price =0.90*quantity;
            }else if (fruit.equals("grapefruit")){
                price =1.60*quantity;
            }else if (fruit.equals("kiwi")){
                price =3.00*quantity;
            }else if (fruit.equals("pineapple")){
                price =5.60*quantity;
            }else if (fruit.equals("grapes")){
                price =4.20*quantity;
            }
        }
       System.out.printf("%.02f",price);
    }
}
