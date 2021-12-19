package com.sk;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        //Taking Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int square = num*num;
        int sum = 0;

        //Adding the digits of the number
        while(square > 0) {
            int rem = square % 10;
            sum = sum + rem;
            square /= 10;
        }
        //Checking if the number is neon number
        if(num == sum) {
            System.out.println("Given number is neon number");
        }
        else {
            System.out.println("Given number is not neon number");
        }

    }
}
