/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.util.*;

/**
 *
 * @author MTQV
 */
public class rut_gon_xau_ki_tu {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        while (true) {
            boolean check = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    check = true;
                    break;
                }
            }
            if (!check) {
                break;
            }
        }
        if (s.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }
}
