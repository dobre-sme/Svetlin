package ListsLite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input :   ");

        String[] values = scanner.nextLine().split("\\s+");


        List<Integer> input = new ArrayList<>();

        List<Integer> inputRev = reverseM(input);

        List<Integer> resluts = new ArrayList<>();


        for (int i = 0; i < values.length; i++) {

            int number = Integer.parseInt(values[i]);

            if (number <= -1) {
                resluts.add(number);
            } else if (number > 0) {
                input.add(number);
            }

        }
        for (Integer numb : reverseM(input)) {

            System.out.println(numb);
        }


    }

    public static List<Integer> reverseM(List<Integer> input) {

        List<Integer> reverseM = new ArrayList<>();
        for (int i = input.size() - 1; i >= 0; i--) {
            reverseM.add(input.get(i));
        }
        return reverseM;
    }
}
