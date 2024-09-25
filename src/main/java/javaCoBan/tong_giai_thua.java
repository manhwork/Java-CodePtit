/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaCoBan;

import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class tong_giai_thua {

    public static Scanner sc = new Scanner(System.in);

    public static void testcase() {
        long n = sc.nextLong();
        long res = 0;
        long ans = 1;
        for (long i = 1; i <= n; i++) {
            ans *= i;
            res += ans;
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        testcase();
    }
}
