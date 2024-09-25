package com.mycompany.java_ptit.javaMang;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class hop_cua_hai_day_so_1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] cnt = new int[1005];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            arr.add(a[i]);
            cnt[a[i]] = 1;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            if (cnt[b[i]] == 0) {
                arr.add(b[i]);
                cnt[b[i]] = 1;
            }
        }

        arr.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer x : arr) {
            System.out.print(x + " ");
        }
    }

}
