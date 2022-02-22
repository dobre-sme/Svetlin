package ComplexConditions;

import java.util.Scanner;

public class ComplexConditions7 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String city = scanner.nextLine();
        String sales = scanner.nextLine();
        double s = Double.parseDouble(sales);

        if(city.equals("Sofia")){

            if(s>=0 && s<=500){
                s=(5*s)/100;
            }else if(s>500 && s<=1000){
                s=(7*s)/100;
            }else if(s>1000 && s<=10000){
                s=(8*s)/100;
            }else if(s>10000){
                s=(12*s)/100;
            }
            System.out.printf("%.02f",s);
        }else if(city.equals("Varna")){
            if(s>=0 && s<=500){
                s=(4.5*s)/100;
            }else if(s>500 && s<=1000){
                s=(7.5*s)/100;
            }else if(s>1000 && s<=10000){
                s=(10*s)/100;
            }else if(s>10000){
                s=(13*s)/100;
            }
            System.out.printf("%.02f",s);
        }else if(city.equals("Plovdiv")){
            if(s>=0 && s<=500){
                s=(5.5*s)/100;
            }else if(s>500 && s<=1000){
                s=(8*s)/100;
            }else if(s>1000 && s<=10000){
                s=(12*s)/100;
            }else if(s>10000){
                s=(14.5*s)/100;
            }
            System.out.printf("%.02f",s);
        }else{
            System.out.println("Error");
        }

    }
}
