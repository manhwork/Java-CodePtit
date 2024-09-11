/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld.Javamang;

import java.util.*;

public class J02021_liet_ke_to_hop_2 {

    public static Scanner sc = new Scanner(System.in);
    public static int n, k, cnt = 0;
    public static int[] a = new int[100];

    public static void show() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    public static void ql(int i) {
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
        System.out.println("");
        System.out.printf("Tong cong co %d to hop", cnt);
    }
}
