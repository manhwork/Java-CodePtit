/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javacoban;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class so_chinh_phuong {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println((long)sqrt(n) == (float)sqrt(n) ? "YES" : "NO");
        }
    }
}
