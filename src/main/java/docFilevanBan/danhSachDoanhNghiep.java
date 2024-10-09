/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class dn{
    String ma, name, tc;

    public dn(String ma, String name, String tc) {
        this.ma = ma;
        this.name = name;
        this.tc = tc;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", ma, name, tc);
    } 
}
public class danhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        dn[] p = new dn[n];
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String tc = sc.nextLine();
            p[i] = new dn(ma, name, tc);
        }
        Arrays.sort(p, (o1, o2) -> {
            return o1.ma.compareTo(o2.ma);
        });
        for (dn x : p) {
            System.out.println(x);
        }
    }
}

//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
