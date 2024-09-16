/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.Scanner;

public class boi_so_nho_nhat_cua_n_so_nguyen_duong_nho_nhat {

    public static Scanner sc = new Scanner(System.in);

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long tmp = 1;
            for(long i=2;i<=n;i++){
                tmp = lcm(tmp,i);
            }
            System.out.println(tmp);
        }
    }
}
