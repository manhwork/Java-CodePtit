/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.*;

public class J02106_ma_tran_nhi_phan {
//3
//1 1 0
//1 1 1
//1 0 0  
//2
//1 0 0
//0 1 1
    public static int[][] a = new int[1005][3];
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int dem = 0;
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 1) {
                    dem++;
                }
            }
            if (dem > 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
