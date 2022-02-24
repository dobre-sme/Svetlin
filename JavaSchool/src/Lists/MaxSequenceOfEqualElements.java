package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        int count = 0, maxCount = 0;

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            if (!list2.contains(input[i])) {
                for (int j = 0; j < input.length; j++) {
                    if (input[i].equals(input[j])) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    list.clear();
                    list.add(input[i]);
                }
                count = 0;
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(list.get(0) + " ");
        }
    }
}
