package Conditions;

import java.util.Objects;
import java.util.Scanner;

public class Conditions13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        if (Objects.equals(a, b) && Objects.equals(a, c)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
