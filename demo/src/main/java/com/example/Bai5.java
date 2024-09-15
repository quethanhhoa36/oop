package com.example;

import java.util.Scanner;

public class Bai5 {
    public static void ptbac1(float a, float b) {
        if (a == 0) {
            System.out.println("phuong trinh vo so nghiem");
        } else
            System.out.println("x=" + -(b / a));
    }

    public static void ptbac2(float a, float b, float c) {
        if (a == 0) {
            ptbac1(b, c);
        }
        if (b * b - 4 * a * c > 0) {
            System.out.println("phuong trinh co 2 nghiem phan biet");
            System.out.println("x1 = " + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        }
        if (b * b - 4 * a * c == 0) {
            System.out.println("phuong trinh co nghiem kep x = " + -b / (2 * a));
        }
        if (b * b - 4 * a * c < 0) {
            System.out.println("phuong trinh vo nghiem");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        ptbac1(a, b);
        ptbac2(a, b, c);
        input.close();
    }
}
