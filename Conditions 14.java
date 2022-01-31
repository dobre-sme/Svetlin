package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        String[] a = { " ", " One", " Two", " Three", " Four", " Five", " Six",
                " Seven", " Eight", " Nine", " Ten", " Eleven",
                " Twelve", " Thirteen", " Fourteen", "Fifteen",
                " Sixteen", " Seventeen", " Eighteen", " Nineteen" };

        String[] b = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty",
                "Seventy", " Eighty", " Ninety" };

        if (input > 19 && input <100)
        {
            System.out.print(b[input / 10] + " " + a[input % 10]);
        }
        else
        {
            System.out.print(" " + "One Hundred");
        }
    }
}
