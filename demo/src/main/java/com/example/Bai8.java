package com.example;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int dem = 0;
        int[] a;
        a = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] == x) {
                dem++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println(dem);
        in.close();
    }
}
