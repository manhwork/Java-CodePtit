package com.mycompany.java_ptit.javaMang;

import java.util.Scanner;

public class J03004_chuan_hoa_xau_ho_ten_1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] tokens = s.trim().replaceAll("\\s+", " ").split(" ");
            String result = "";
            for (String token : tokens) {
                if (token.length() == 1) {
                    result += token.toUpperCase() + " ";
                } else {
                    result += token.substring(0, 1).toUpperCase() + token.substring(1).toLowerCase() + " ";
                }
            }
            System.out.println(result);
        }
    }
}
