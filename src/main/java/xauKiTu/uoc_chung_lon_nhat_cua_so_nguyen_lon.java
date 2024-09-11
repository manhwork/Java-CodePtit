/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class uoc_chung_lon_nhat_cua_so_nguyen_lon {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger gcd = a.gcd(b);
            System.out.println(gcd);
        }
    }
}

//1
//1221
//1234567891011121314151617181920212223242526272829