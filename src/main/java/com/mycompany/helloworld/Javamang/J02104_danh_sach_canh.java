package com.mycompany.helloworld.Javamang;

import java.util.*;

public class J02104_danh_sach_canh {

    public static Scanner sc = new Scanner(System.in);
//6
//0 1 1 0 1 0
//1 0 1 0 1 0
//1 1 0 1 0 0
//0 0 1 0 1 1
//1 1 0 1 0 1
//0 0 0 1 1 0
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] a = new int[n + 5][n + 5];
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j] == 1) {
                    System.out.printf("(%d,%d)\n", i + 1, j + 1);
                }
            }
        }
    }
}
