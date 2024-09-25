/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class dao_tu {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            for (String x : s) {
                for (int i = x.length() - 1; i >= 0; i--) {
                    System.out.print(x.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

//2
//ABC DEF
//123 456
