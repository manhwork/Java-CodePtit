/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_ptit.javaMang;

import java.util.*;

public class thu_gon_day_so_1 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        while (true) {
            boolean stop = true;
            for (int i = 0; i < a.size() - 1; i++) {
                if ((a.get(i) + a.get(i + 1)) % 2 == 0) {
                    a.remove(i + 1);
                    a.remove(i);
                    i--; // để vòng for tới i++ -> i vẫn giữ được vị trí cũ
                    stop = false;
                }
            }
            if (stop) {
                System.out.println(a.size());
                return;
            }
        }
    }
}
