/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class DaySo {

    int n;
    int[] a;
    int[] bin;
    ArrayList<String> v;

    public DaySo(int n, int[] a) {
        this.n = n;
        this.a = a;
        bin = new int[n];
        v = new ArrayList<>();
    }

    public void check() {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (bin[i] == 1) {
                tmp.add(a[i]);
            }
        }
        if (tmp.size() > 1) {
            boolean up = true;
            for (int i = 1; i < tmp.size(); i++) {
                if (tmp.get(i - 1) >= tmp.get(i)) {
                    up = false;
                    break;
                }
            }
            if (up) {
                String s = "";
                for (Integer x : tmp) {
                    s += x + " ";
                }
                v.add(s);
            }
        }
    }

    public void ql(int i) {
        for (int j = 0; j <= 1; j++) {
            bin[i] = j;
            if (i == n - 1) {
                check();
            } else {
                ql(i + 1);
            }
        }
    }

    public void solve() {
        ql(0);
        Collections.sort(v);
        for (String x : v) {
            System.out.println(x);
        }
    }

}

public class dayConTangDan {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        DaySo p = new DaySo(n, a);
        p.solve();
    }
}
