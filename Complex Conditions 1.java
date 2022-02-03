package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String art = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = scanner.nextDouble();
        double price = 0.0;



        if(city.equals("Sofia")){
            if(art.equals("coffee")){
                price = 0.50*quantity;
            }else if(art.equals("water")){
                price = 0.80*quantity;
            }else if(art.equals("beer")){
                price = 1.20*quantity;
            }else if(art.equals("sweets")){
                price = 1.45*quantity;
            }else if(art.equals("peanuts")){
                price = 1.60*quantity;
            }

        }else if(city.equals("Plovdiv")){

            if(art.equals("coffee")){
                price = 0.40*quantity;
            }else if(art.equals("water")){
                price = 0.70*quantity;
            }else if(art.equals("beer")){
                price = 1.15*quantity;
            }else if(art.equals("sweets")){
                price = 1.30*quantity;
            }else if(art.equals("peanuts")){
                price = 1.50*quantity;
            }

        }else if(city.equals("Varna")){

            if(art.equals("coffee")){
                price = 0.45*quantity;
            }else if(art.equals("water")){
                price = 0.70*quantity;
            }else if(art.equals("beer")){
                price = 1.10*quantity;
            }else if(art.equals("sweets")){
                price = 1.35*quantity;
            }else if(art.equals("peanuts")){
                price = 1.55*quantity;
            }
        }
        System.out.println(price);
    }
}
