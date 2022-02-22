package Conditions;

import java.util.Scanner;

public class Conditions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Compare : ");
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();

        if (numb1 > numb2) {
            System.out.println(numb1);
        } else {
            System.out.println(numb2);
        }
    }
}
