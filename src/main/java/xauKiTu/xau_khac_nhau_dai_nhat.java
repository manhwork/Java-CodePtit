/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import static java.lang.Integer.max;
import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class xau_khac_nhau_dai_nhat {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(a.equals(b) ? "-1" : max(a.length(), b.length()));
        }
    }
}
//2
//abcd
//defgh
//a
//a
