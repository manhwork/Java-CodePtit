package mangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MTQV
 */
class SinhVien1 {

    String ma, name, lop, ns;
    double gpa;
    static int count = 1;

    public SinhVien1(String name, String lop, String ns, double gpa) throws ParseException {
        ma = String.format("B20DCCN%03d", count++);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ns = sdf.format(sdf.parse(ns));
        this.name = formatName(name);
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    private String formatName(String name) {
        String[] tokens = name.trim().toLowerCase().split("\\s+");
        String s = "";
        for (String x : tokens) {
            x = x.substring(0, 1).toUpperCase() + x.substring(1);
            s += x + ' ';
        }
        return s.substring(0, s.length() - 1);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", ma, name, lop, ns, gpa);
    }

}

public class danhSachDoiTuongSinhVien2 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien1[] p = new SinhVien1[n];
        for (int i = 0; i < n; i++) {
            p[i] = new SinhVien1(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        }
        for (SinhVien1 x : p) {
            System.out.println(x);
        }
    }
}

//1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1
