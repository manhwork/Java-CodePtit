///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package danhsachsinhvien1;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInput;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
///**
// *
// * @author MTQV
// */
//class SinhVien implements Serializable {
//
//    static int cnt = 1;
//    String ma, ten, lop;
//    Date ns;
//    float gpa;
//
//    public SinhVien(String ma, String ten, String lop, String ns, float gpa) throws ParseException {
//        ma = "B20DCCN" + String.format("%3d", cnt++);
//        this.ma = ma;
//        this.ten = ten;
//        this.lop = lop;
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        ns = sdf.format(ns);
//        this.ns = sdf.parse(ns);
//        this.gpa = gpa;
//    }
//
//    public String getMa() {
//        return ma;
//    }
//
//    public void setMa(String ma) {
//        this.ma = ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    public void setLop(String lop) {
//        this.lop = lop;
//    }
//
//    public Date getNs() {
//        return ns;
//    }
//
//    public void setNs(Date ns) {
//        this.ns = ns;
//    }
//
//    public float getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(float gpa) {
//        this.gpa = gpa;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s %s %.2f", ma, ten, lop, ns, gpa);
//    }
//
//}
//
//public class danhSachSinhVienTrongFileNhiPhan {
//
//    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ObjectInputStream data = new ObjectInputStream(new FileInputStream("SV.in"));
//        ArrayList<SinhVien> p = (ArrayList<SinhVien>) data.readObject();
//        for (SinhVien x : p) {
//            System.out.println(x);
//        }
//    }
//}
