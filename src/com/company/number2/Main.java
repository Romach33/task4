package com.company.number2;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int n = readInt();
        int sum = findSum(n);
        System.out.println("the sum of the series is: " + sum);
    }

    private static int readInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n = ");
        return sc.nextInt();
    }

    private static int findTerm(int n) {
        int multiplier = 1;

        for (int i = n; i <= 2 * n; i++) {
            multiplier = multiplier * i;
        }
        
        return multiplier;
    }

    private static int findSum(int n) {
        int sum = 0;

        for (int k = 1; k <= n; k++) {
            sum = sum + findTerm(k);
        }

        return sum;
    }

}

