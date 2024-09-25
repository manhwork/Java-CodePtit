/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.*;

public class J03005_chuan_hoa_xau_ho_ten_2 {
//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = new String[100];
            tokens = line.trim().replaceAll("\\s+", " ").split(" ");
//            for(String x : tokens){
//                System.out.println(x);
//            }
            String result = "";
            for (int i = 1; i < tokens.length; i++) {
                tokens[i] = tokens[i].substring(0, 1).toUpperCase() + tokens[i].substring(1).toLowerCase();
                result += tokens[i];
                if (i == tokens.length - 1) {
                    result += ", ";
                } else {
                    result += " ";
                }
            }
            result += tokens[0].toUpperCase();
            System.out.println(result);
        }
    }
}
