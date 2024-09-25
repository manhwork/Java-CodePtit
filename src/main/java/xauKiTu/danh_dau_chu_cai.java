/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.util.*;

public class danh_dau_chu_cai {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        System.out.println(set.size());
    }
}
