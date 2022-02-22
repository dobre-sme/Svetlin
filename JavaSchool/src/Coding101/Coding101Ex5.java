package Coding101;

import java.time.LocalDate;
import java.util.Scanner;

public class Coding101Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        LocalDate date = LocalDate.of(2020, m, d);
        System.out.println(date.plusDays(5));
    }
}
