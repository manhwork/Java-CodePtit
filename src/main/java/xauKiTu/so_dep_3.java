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
public class so_dep_3 {

    public static Scanner sc = new Scanner(System.in);

    public static boolean stn(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            } else {
                if (s.charAt(l) == '0' || s.charAt(l) == '4' || s.charAt(l) == '6' || s.charAt(l) == '8' || s.charAt(l) == '9') {
                    return false;
                }
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
//3
//123456787654321
//235755557532
//2222333355557777235775327777555533332222
