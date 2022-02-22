package ComplexConditions;

import java.util.Scanner;

public class ComplexConditions4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int input = scanner.nextInt();

        if ((input >= 100 && input <= 200) || input == 0 ){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }


    }
}
