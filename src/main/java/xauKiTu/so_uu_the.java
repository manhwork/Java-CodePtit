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
public class so_uu_the {

    public static Scanner sc = new Scanner(System.in);

    public static String sut(String s) {
        int cnt_odd = 0;
        int cnt_even = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                return "INVALID";
            } else {
                if ((s.charAt(i) - '0') % 2 == 0) {
                    cnt_even++;
                } else {
                    cnt_odd++;
                }
            }
        }
        int sum = cnt_odd + cnt_even;
        if (sum % 2 == 0 && cnt_even > cnt_odd) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(sut(s));
        }
    }
}

//3
//01234aa32432432432534545b987978
//1234567890123456789000
//999999999999999999999999999999