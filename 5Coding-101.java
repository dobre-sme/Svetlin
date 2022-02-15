package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String d = scanner.nextLine();
        String m = scanner.nextLine();

        int dayCount = Integer.parseInt(d);
        int monthCount = Integer.parseInt(m);

        int months = monthCount % 12;

        if(m.equals("04")||m.equals("06")||m.equals("09")||m.equals("11")){
            if(dayCount<25){
                 dayCount=(dayCount-30)+5;
            }else{
                months++;
            }
        }if(m.equals("02")){
            if(dayCount<23){
                dayCount=dayCount+5;
            }else{
                dayCount=(dayCount-28)+5;
                months++;
            }
        }else{
            if(dayCount<26){
                dayCount=dayCount+5;
            }else{
                dayCount=(dayCount-31)+5;
                months++;
            }
        }
        System.out.printf(dayCount + "." + "%02d", months);
    }
}
