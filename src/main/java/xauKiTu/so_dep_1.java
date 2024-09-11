/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.util.*;

public class so_dep_1 {
//4
//123456787654321
//86442824468
//8006000444422220000222244440006008
//235365789787654324567856578654356786556

    public static Scanner sc = new Scanner(System.in);

    public static boolean stn(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r) || (s.charAt(l) - '0') % 2 != 0) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(stn(s) ? "YES" : "NO");
        }
    }
}
