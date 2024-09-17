/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class chia_het {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if (a.compareTo(b) == -1) {
                BigInteger tmp = a;
                a = b;
                b = tmp;
            }
            System.out.println(a.mod(b).equals(BigInteger.ZERO) ? "YES" : "NO");
        }
    }
}
//2
//18 7
//3 123
