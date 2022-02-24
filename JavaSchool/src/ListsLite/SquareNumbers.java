package ListsLite;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersIn = new LinkedList<>();

        System.out.println("Input : ");

        String[] input = scanner.nextLine().split(" ");


        for (String s : input) {
            int value = Integer.parseInt(s);
            if (Math.sqrt(value) == (int) Math.sqrt(value)) {
                numbersIn.add(value);
            }
        }

        Collections.sort(numbersIn);

        for (int i = numbersIn.size() - 1; i >= 0; i--) {

            int keypoint = numbersIn.get(i);
            if (i <= numbersIn.size() - 1) {
                System.out.print(keypoint + " ");
            } else {
                System.out.print(keypoint);
            }
        }
    }
}
