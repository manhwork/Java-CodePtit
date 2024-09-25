/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class tach_doi_va_tinh_tong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        while (s.length() != 1) {
            int mid = s.length() / 2;
            BigInteger a = new BigInteger(s.substring(0, mid));
            BigInteger b = new BigInteger(s.substring(mid));
            s = a.add(b).toString();
            System.out.println(s);
        }
    }
}
