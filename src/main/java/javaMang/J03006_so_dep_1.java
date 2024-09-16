/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class J03006_so_dep_1 {
//4
//123456787654321
//86442824468
//8006000444422220000222244440006008
//235365789787654324567856578654356786556
    private static final Scanner sc = new Scanner(System.in);

    private static boolean stn(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
        }
        return true;
    }

    private static boolean csChan(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println((stn(s) && csChan(s)) ? "YES" : "NO");
        }
    }
}
