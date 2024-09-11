/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.util.*;

/**
 *
 * @author admin
 */
public class tap_tu_rieng_cua_hai_xau {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] a = sc.nextLine().split("\\s+");
            String b = sc.nextLine();
            HashSet<String> set = new HashSet<>();
            for (String item : a) {
                if (!b.contains(item)) {
                    set.add(item);
                }
            }
            for (String item : set) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }
    }
}

//2
//abc ab ab ab abcd
//ab abc
//aaa xyz ab zzz abc dd dd abc
//xyz dd ttt sas cdc