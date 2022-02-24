package ListsLite;

import java.util.*;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input : ");

        String[] input = scanner.nextLine().split(" ");

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
        countFrequencies(list);
    }

    public static void countFrequencies(ArrayList<String> list) {

        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println(val.getKey() +
                    "->"
                    + val.getValue());
        }
    }
}
