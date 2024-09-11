/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld.Javamang;

import java.util.*;

/**
 *
 * @author admin
 */
public class J02105_danh_sach_ke {
//6
//0 1 1 0 1 0
//1 0 1 0 1 0
//1 1 0 1 0 0
//0 0 1 0 1 1
//1 1 0 1 0 1
//0 0 0 1 1 0
    public static int[][] a = new int[1005][1005];
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ",i+1);
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    System.out.printf("%d ", j + 1);
                }
            }
            System.out.println("");
        }
    }

}
