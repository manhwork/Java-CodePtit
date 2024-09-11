/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld.Javamang;

import java.util.*;

public class J02020_liet_ke_to_hop {

    private static final Scanner sc = new Scanner(System.in);

    private static int n, k, cnt = 0;
    private static int[] a = new int[100];

    private static void show() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    private static void ql(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                show();
                cnt++;
            } else {
                ql(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        ql(1);
        System.out.printf("Tong cong co %d to hop", cnt);
    }
}
