/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.*;

public class tich_ma_tran_chuyen_vi_cua_no {

//1
//2  2
//1  2
//3  4    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int T = 0; T < t; T++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            int[][] b = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = a[j][i];
                }
            }

            System.out.printf("Test %d:\n", T + 1);

            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    int sum = 0;
                    for (int j = 0; j < m; j++) {
                        sum += a[i][j] * b[j][k];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
    }
}
