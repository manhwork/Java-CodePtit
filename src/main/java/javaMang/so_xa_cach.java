/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import static java.lang.Math.abs;
import java.util.*;

public class so_xa_cach {

    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static int[] a = new int[100];
    public static boolean[] datham = new boolean[100];

    public static boolean check() {
        for (int i = 1; i <= n - 1; i++) {
            if (abs(a[i + 1] - a[i]) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void show() {
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
    }

    public static void ql(int i) {
        for (int j = 1; j <= n; j++) {
            if (!datham[j]) {
                a[i] = j;
                datham[j] = true;
                if (i == n) {
                    if (check()) {
                        show();
                    }
                } else {
                    ql(i + 1);
                }
                datham[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            ql(1);
        }
    }
}
