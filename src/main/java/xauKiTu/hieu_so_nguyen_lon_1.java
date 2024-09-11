/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import static java.lang.Math.*;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author admin
 */
public class hieu_so_nguyen_lon_1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger c = a.subtract(b).abs();
            int maxLength = max(a.toString().length(), b.toString().length());
            int cLength = c.toString().length();
            StringBuilder res = new StringBuilder(c.toString());
            while (res.length() < maxLength) {
                res.insert(0, '0');
            }
            System.out.println(res.toString());
        }
    }
}
//2
//99999
//1000000
//100
//100000000

//1
//999999
//1000000
