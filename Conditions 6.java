package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double value = Double.parseDouble(type);
        String input = scanner.nextLine();
        String output = scanner.nextLine();


        if(Objects.equals(input, "mm")){
            value = value / 1000;
        }
        if(Objects.equals(input, "cm")){
            value = value / 100;
        }
        if(Objects.equals(input, "mi")){
            value = value / 0.000621371192;
        }
        if(Objects.equals(input, "in")){
            value = value / 39.3700787;
        }
        if(Objects.equals(input, "km")){
            value = value / 0.001;
        }
        if(Objects.equals(input, "ft")){
            value = value / 3.2808399;
        }
        if(Objects.equals(input, "yd")){
            value = value / 1.0936133;
        }
        if(Objects.equals(output, "mm")) {
            value = value * 1000;
        }
        if(Objects.equals(output, "cm")) {
            value = value * 100;
        }
        if(Objects.equals(output, "mi")) {
            value = value * 0.000621371192;
        }
        if(Objects.equals(output, "in")) {
            value = value * 39.3700787;
        }
        if(Objects.equals(output, "km")) {
            value = value * 0.001;
        }
        if(Objects.equals(output, "ft")) {
            value = value * 3.2808399;
        }
        if(Objects.equals(output, "yd")) {
            value = value * 1.0936133;
        }

        System.out.println(value + " " +output );
    }
}
