/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.Scanner;

public class dem_so_lan_xuat_hien {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        int dem = 0;

        while (t-- > 0) {
            dem++;
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            int[] cnt = new int[100005];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Test " + dem + ":");
            for (int i = 0; i < n; i++) {
                cnt[a[i]]++;
            }
            for (int i = 0; i < n; i++) {
                if (cnt[a[i]] > 0) {
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                    cnt[a[i]] = 0;
                }
            }
        }

    }
}
