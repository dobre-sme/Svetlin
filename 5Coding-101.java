package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        LocalDate date = LocalDate.of(2020,m,d);
        System.out.println(date.plusDays(5));
    }
}
