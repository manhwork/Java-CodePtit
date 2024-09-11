/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class so_dep_2 {
//4
//123456787654321
//8644281154664511824468
//8006000444400000000000044440006008
//82123400000000000000000000000432128
    public static Scanner sc = new Scanner(System.in);

    public static boolean stn(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean check(String s) {
        long sum = 0l;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - '0');
        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(stn(s) && check(s) ? "YES" : "NO");
        }
    }
}
