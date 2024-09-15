package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        while (true) {
            try {
                a = input.nextInt();
                b = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("NhapLai");
                input.next();
            }
        }
        System.out.println(a + b);
        input.close();
    }
}