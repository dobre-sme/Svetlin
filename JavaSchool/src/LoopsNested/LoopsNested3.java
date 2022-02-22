package LoopsNested;

import java.util.Scanner;

public class LoopsNested3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        double n = 0.5;

        for (int i = 0; i < input+1; i++) {
            n = n * 2;
            if(i % 2 == 0){
                System.out.printf("%.0f%n",n);
            }
        }
    }
}
