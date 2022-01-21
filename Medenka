import java.util.Scanner;


public class medenka {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int darkDmg = 0;
        int whiteDmg = 0;

        int consecutiveDarkAttacks = 1;
        int consecutiveWhiteAttacks = 1;

        int previousDarkAttackDmg = 0;
        int previousWhiteAttackDmg = 0;


        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] arguments = input.split("\\s+");
            int countOfMedenkas = Integer.parseInt(arguments[0]);
            String typeOfMedenkas = arguments[1];
            int currentAttackDmg = (countOfMedenkas * 60);


            if (typeOfMedenkas.equals("dark")) {
                if (currentAttackDmg == previousDarkAttackDmg) {
                    consecutiveDarkAttacks++;
                } else {
                    consecutiveDarkAttacks = 1;
                }

                if (consecutiveDarkAttacks == 5) {
                    currentAttackDmg = (int) (currentAttackDmg * 4.5);
                    consecutiveDarkAttacks = 1;
                }
                darkDmg = darkDmg + currentAttackDmg;
                previousDarkAttackDmg = currentAttackDmg;
            } else if (typeOfMedenkas.equals("white")) {
                if (currentAttackDmg == previousWhiteAttackDmg) {
                    consecutiveWhiteAttacks++;
                } else {
                    consecutiveWhiteAttacks = 1;
                }

                if (consecutiveWhiteAttacks == 2) {
                    currentAttackDmg = (int) (currentAttackDmg * 2.75);
                    consecutiveWhiteAttacks = 1;




                }
                whiteDmg = whiteDmg + currentAttackDmg;
                previousWhiteAttackDmg = currentAttackDmg;


            }

            input = scanner.nextLine();

        }
        if (darkDmg > whiteDmg) {

            System.out.println("Winner - Naskor");
            System.out.println("Damage - " + darkDmg);
        } else {
            System.out.println("Winner - Viktor");
            System.out.println("Damage - " + whiteDmg);
        }

    }


}
