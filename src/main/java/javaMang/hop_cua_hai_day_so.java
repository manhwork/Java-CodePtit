/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class hop_cua_hai_day_so {   

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] cnt = new int[10005];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]] = 1;
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            cnt[b[i]] = 1;
        }

        for (int i = 0; i < 10005; i++) {
            if (cnt[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
