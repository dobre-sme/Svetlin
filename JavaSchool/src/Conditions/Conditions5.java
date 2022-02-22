package Conditions;

import java.util.Scanner;

public class Conditions5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int result = input1 + input2 + input3;
        int min = 1;
        String seconds_string = String.format("%02d", result % 60);

        if (result <= 59) {

            System.out.println("0:" + seconds_string);

        } else if (result <= 119) {

            System.out.println(min + ":" + seconds_string);

        } else if (result <= 179) {

            System.out.println((min + min) + ":" + seconds_string);
        }


    }
}
