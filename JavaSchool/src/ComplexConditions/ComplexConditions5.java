package ComplexConditions;

import java.util.Scanner;

public class ComplexConditions5 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if((x==x1 || x==x2 && y >= y1 && y <= y2)||(y==y1 || y==y2 && x >= x1 && x <= x2)){
            System.out.println("Border");
        }
        else if(x >= x1 && x <= x2 && y >= y1 && y <= y2){
            System.out.println("Inside");
        }else {
            System.out.println("Outside");
        }

    }
}
