/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author MTQV
 */
public class boi_chung_nho_nhat {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.divide(a.gcd(b)).multiply(b));
        }
    }
}

//3
//12
//100
//1212
//8888
//121212121212121212
//45678978
