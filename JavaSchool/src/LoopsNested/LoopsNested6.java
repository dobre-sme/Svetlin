package LoopsNested;

import java.util.Scanner;

public class LoopsNested6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (b != 0){
            int lastB = b;
            b = a%b;
            a=lastB;
        }
        System.out.println(a);
    }
}
