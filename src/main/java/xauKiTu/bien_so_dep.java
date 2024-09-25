/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class bien_so_dep {

    private static Scanner sc = new Scanner(System.in);

    private static boolean check1(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean check2(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean check3(String s) {
        return s.charAt(1) == s.charAt(0) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4);
    }

    private static boolean check4(String s) {
        for (char c : s.toCharArray()) {
            if (c != '6' && c != '8') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String bienso = s.substring(5, 8) + s.substring(9);
            System.out.println(check1(bienso) || check2(bienso) || check3(bienso) || check4(bienso) ? "YES" : "NO");
        }
    }
}

//7
//29T1–123.45
//29T1–555.55
//29T1–222.33
//29T1–686.88
//29T1–123.33
//29T1–555.54
//29T1–606.88
