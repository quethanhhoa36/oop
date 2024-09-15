package com.example;

import java.util.Scanner;

public class Bai7 {
    public static String tachten(String x) {
        String ten;
        ten = "";
        int i = x.length() - 1;
        while (x.charAt(i) != ' ') {
            i--;
        }
        ten = x.substring(x.length() - i + 3);
        return ten;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hovaten;
        hovaten = input.nextLine();
        String ten = tachten(hovaten);
        System.out.println(ten);
        input.close();
    }
}
