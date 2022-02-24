package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("Odd") && !command[0].equals("Even")) {
            String element = String.valueOf(command[1]);
            if (command[0].equals("Delete")) {
                list.removeAll(Collections.singleton(element));

            }
            if (command[0].equals("Insert")) {
                int position = Integer.parseInt(command[2]);
                list.add(position, element);
            }
            command = scanner.nextLine().split(" ");
        }

        if (command[0].equals("Odd")) {
            for (int i = 0; i < list.size(); i++) {
                int num = Integer.parseInt(list.get(i));
                if (num % 2 == 0) {
                    list.remove(list.get(i));
                    i--;
                }
            }
        }
        if (command[0].equals("Even")) {
            for (int i = 0; i < list.size(); i++) {
                int num = Integer.parseInt(list.get(i));
                if (num % 2 == 1) {
                    list.remove(list.get(i));
                    i--;
                }
            }
        }
        System.out.print(list.toString().replace("[", "").
                replace("]", "").replace(",", ""));
    }
}
