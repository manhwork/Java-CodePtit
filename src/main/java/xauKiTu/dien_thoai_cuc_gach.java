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
public class dien_thoai_cuc_gach {

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

    public static char ktao(char c) {
        if (c == 'a' || c == 'b' || c == 'c') {
            return '2';
        }
        if (c == 'd' || c == 'e' || c == 'f') {
            return '3';
        }
        if (c == 'g' || c == 'h' || c == 'i') {
            return '4';
        }
        if (c == 'j' || c == 'k' || c == 'l') {
            return '5';
        }
        if (c == 'm' || c == 'n' || c == 'o') {
            return '6';
        }
        if (c == 'p' || c == 'q' || c == 'r' || c == 's') {
            return '7';
        }
        if (c == 't' || c == 'u' || c == 'v') {
            return '8';
        }
        if (c == 'w' || c == 'x' || c == 'y' || c == 'z') {
            return '9';
        }
        return 0;
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String tmp = "";
            for (int i = 0; i < s.length(); i++) {
                tmp += ktao(s.charAt(i));
            }
            System.out.println(stn(tmp) ? "YES" : "NO");
        }
    }
}

//2
//BOHIMA
//IamACoder
