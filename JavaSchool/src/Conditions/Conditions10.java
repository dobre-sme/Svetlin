package Conditions;

import java.util.Scanner;

public class Conditions10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextDouble();

        if (input <= 10) {
            System.out.println("slow");
        }
        if (input > 10 && input <= 50) {
            System.out.println("average");
        }
        if (input > 50 && input <= 150) {
            System.out.println("fast");
        }
        if (input > 150 && input <= 1000) {
            System.out.println("ultra fast");
        }
        if (input > 1000) {
            System.out.println("extremely fast");
        }

    }
}
