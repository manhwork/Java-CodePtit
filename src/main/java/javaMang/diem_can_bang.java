/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.*;

public class diem_can_bang {

//2
//7
//-7 1 5 2 -4 3 0
//5
//1 2 3 4 5
    
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            int[] f = new int[n + 5]; // Cộng dồn
            boolean check = false ;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            f[0] = a[0];
            for (int i = 1; i < n; i++) {
                f[i] = f[i - 1] + a[i];
            }
            for (int i = 1; i < n-1; i++) {
                int truoc = f[i - 1];
                int sau = f[n - 1] - f[i];
//                System.out.println(truoc);
//                System.out.println(sau);
                if (truoc == sau) {
                    System.out.println(i + 1);
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println("-1");
            }
        }
    }
}
