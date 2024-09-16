package com.mycompany.java_ptit.javacoban;

import java.util.Scanner;

public class so_tam_phan {

    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
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
            System.out.println(check(s) ? "YES" : "NO");
        }
    }

}
