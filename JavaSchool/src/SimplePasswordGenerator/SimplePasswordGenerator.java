package SimplePasswordGenerator;

import java.util.Scanner;

public class SimplePasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int l = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                char endk = (char) ('a' + l);

                for (char k = 'a'; k < endk; k++) {

                    char endm = (char) ('a' + l);

                    for (char m = 'a'; m < endm; m++) {

                        for (int o = 1; o <= n; o++) {

                            if (o > i && o > j) {

                                System.out.print(i + "" + j + "" + k + "" + m + "" + o + " ");
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
