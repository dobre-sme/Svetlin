package Loops;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        }

    }
}
