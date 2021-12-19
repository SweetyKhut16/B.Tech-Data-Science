package com.sk;

import java.util.Scanner;

public class ISBN_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;
        int a[] = new int[10];

        //Taking input for the number
        for (int i = 0; i < num; i++) {
            System.out.println("Enter a 10 digit number:m");
            a[i] = input.nextInt();
        }

        int sum = a[9]*1+a[8]*2+a[7]*3+a[6]*4+a[5]*5+a[4]*6+a[3]*7+a[2]*8+a[1]*9+a[0]*10;

        //Checking if number is ISBN number
        if (sum % 11 == 0) {
            System.out.println("This is a ISBN Number");
        } else {
            System.out.println("This is not a ISBN Number");
        }
    }
}
