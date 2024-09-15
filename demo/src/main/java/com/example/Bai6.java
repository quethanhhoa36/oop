package com.example;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean danhdau = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                danhdau = false;
                break;
            }
        }
        if (danhdau) {
            System.out.println("n la so nguyen to");
        } else {
            System.out.println("n khong phai la so nguyen to");
        }
        input.close();
    }
}
