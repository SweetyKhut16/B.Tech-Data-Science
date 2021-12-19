package com.sk;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int num1 = num;
        int sum = 0;
        int count = 0;

        while(num1 != 0){
            num1 = num1 / 10;
            count++;
        }

        while(num1 > 0){
            int a = num1 % 10;
            sum = (int)(sum + Math.pow(a,count));
            num1 /= 10;
        }
        if (sum == num) {
            System.out.println("Given Number is Armstrong");
        }
        else {
            System.out.println("Number is not Armstrong");
        }

    }
}
