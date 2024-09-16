/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.Scanner;

public class mang_doi_xUNG {

    public static Scanner sc = new Scanner(System.in);

    public static boolean check(int a[],int n) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            if (a[l] != a[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println( check(a, n) ? "YES" : "NO");
        }
    }
}
