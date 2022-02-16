package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(),m = scanner.nextInt(),count=0;

        for (int left = -n; left < n; left++) {
            for (int top = -n; top <n ; top++) {
                for (int right = left+1; right <=n ; right++) {
                    for (int bottom = top+1; bottom <=n ; bottom++) {
                        int area = Math.abs(right-left)*Math.abs(bottom-top);
                        if (area>=m){
                            System.out.printf("(%d,%d)(%d,%d)->%d%n",left,top,right,bottom,area);
                            count++;
                        }
                    }
                }
            }
        }
        if(count==0){
            System.out.println("No");
        }
    }
}
