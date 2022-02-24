package Lists;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        int[] numbers = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            numbers[i] = Integer.parseInt(array1[i]);
        }

        int maxLength = 0;
        int lastIndex = -1;

        int[] len = new int[numbers.length];
        int[] previous = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            len[i] = 1;
            previous[i] = -1;

            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] && len[j] + 1 > len[i]) {
                    len[i] = len[j] + 1;
                    previous[i] = j;
                }
            }

            if (len[i] > maxLength) {
                maxLength = len[i];
                lastIndex = i;
            }
        }

        int[] lis = new int[maxLength];
        int currentIndex = maxLength - 1;

        while (lastIndex != -1) {
            lis[currentIndex] = numbers[lastIndex];
            currentIndex--;
            lastIndex = previous[lastIndex];
        }

        for (int i = 0; i < lis.length; i++) {
            System.out.print(lis[i] + " ");
        }

    }
}
