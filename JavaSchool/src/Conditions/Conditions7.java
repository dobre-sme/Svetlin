package Conditions;

import java.util.Objects;
import java.util.Scanner;

public class Conditions7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (Objects.equals(input, "s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password");
        }


    }
}
