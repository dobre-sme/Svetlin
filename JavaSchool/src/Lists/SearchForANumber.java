package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchForANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");
        int numT = scanner.nextInt(), numD = scanner.nextInt(), numSearch = scanner.nextInt();

        for (int i = 0; i < input.length; i++) {
            if (i < numT) {
                list.add(input[i]);
            }

        }
        for (int j = 0; j < list.size(); j++) {
            if (j < numD) {
                list.remove(input[j]);
            }
        }

        if (list.contains(String.valueOf(numSearch))) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }
}
