package com.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray;
        int max = 0;
        int sum = 0;
        myArray = new int[100];
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    myArray[i] = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("NhapLai");
                    input.next();
                }
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
            sum += myArray[i];
        }
        System.out.println(max);
        System.out.println(sum);
        input.close();
    }
}