package ComplexConditions;

import java.util.Scanner;

public class ComplexConditions10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x >= 0 && x <= h * 3 && y == 0)
                || (y >= 0 && y <= h && x == 0)
                || (y == h && x >= 0 && x <= h)
                || (x == h && y >= h && y <= h * 4)
                || (y == h * 4 && x >= h && x <= h * 2)
                || (x == h * 2 && y >= h && y <= h * 4)
                || (y == h && x >= h * 2 && x <= h * 3)
                || (x == h * 3 && y >= 0 && y <= h))
        {
            System.out.println("border");
        }
        else if (x < 0 || y < 0
                || x > h * 3 || y > h * 4
                || (x < h && y > h && y <= h * 4)
                || (x > h * 2 && y > h && y <= h * 4))
        {
            System.out.println("outside");
        }
        else
        {
            System.out.println("inside");
        }
    }
}
