/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MTQV
 */
class SinhVien {

    String ma;
    static int cnt = 0;
    String name, ns, lop;
    double gpa;

    public SinhVien(String name, String lop, String ns, double gpa) {
        this.name = name;
        this.ns = ns;
        this.lop = lop;
        this.gpa = gpa;
        ma = "B20DCCN" + String.format("%03d", ++cnt);
    }

    public void chuanHoa() throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        Date date = formatDate.parse(ns);
        ns = formatDate.format(date);
    }

    @Override
    public String toString() {
        try {
            chuanHoa();
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return String.format("%s %s %s %s %.2f", ma, name, lop, ns, gpa);
    }

}

public class danh_sach_sinh_vien_trong_file_2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] p = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            p[i] = new SinhVien(name, lop, ns, gpa);
        }
        for (SinhVien x : p) {
            System.out.println(x.toString());
        }
    }
}

//1
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19
