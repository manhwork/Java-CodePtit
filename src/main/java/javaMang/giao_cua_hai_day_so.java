package com.mycompany.java_ptit.javaMang;

import java.util.Arrays;
import java.util.Scanner;

public class giao_cua_hai_day_so {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n ];
        int[] b = new int[m ];
        int[] cnt = new int[10005];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]] = 1;
        }
        
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
        
        
        for (int i = 0; i < m; i++) {
            if (cnt[b[i]] == 1) {
                System.out.print(b[i] + " ");
                cnt[b[i]] = 0;
            }
        }
    }
}
