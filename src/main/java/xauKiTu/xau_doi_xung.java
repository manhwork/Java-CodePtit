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
public class xau_doi_xung {

    public static Scanner sc = new Scanner(System.in);

    public static int check(String s) {
        int l = 0;
        int r = s.length() - 1;
        int count = 0;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                count++;
            }
            l++;
            r--;
        }
        return count;
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.next();
            int l = s.length();
            if ((l % 2 == 0 && check(s) == 1) || (l % 2 == 1 && check(s) <= 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

//3
//abccaa
//abbcca
//abcda
