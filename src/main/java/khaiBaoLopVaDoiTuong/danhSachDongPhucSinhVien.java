/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khaiBaoLopVaDoiTuong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MTQV
 */
class SinhVien {

    String ma, name, lop, email, sdt, gt;

    public SinhVien(String ma, String name, String lop, String email, String sdt, String gt) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gt = gt;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", ma, name, lop, email, sdt);
    }

}

public class danhSachDongPhucSinhVien {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(new File("C:\\Users\\MTQV\\Documents\\GitHub\\Java-CodePtit\\src\\main\\java\\khaiBaoLopVaDoiTuong\\SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("C:\\Users\\MTQV\\Documents\\GitHub\\Java-CodePtit\\src\\main\\java\\khaiBaoLopVaDoiTuong\\DANGKY.in"));
        List<SinhVien> p = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        int n = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < n; i++) {
            SinhVien tmp = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            p.add(tmp);
        }
        while (sc2.hasNextLine()) {
            String line = sc2.nextLine();
            String tmp[] = line.trim().split("\\s+");
            
        }
    }
}
