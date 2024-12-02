/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author MTQV
 */
public class DanhSachSinhVienTrongFileNhiPhan {

    public static void main(String[] args) throws Exception {
        ObjectInputStream data = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> p = (ArrayList<SinhVien>) data.readObject();
        for (SinhVien x : p) {
            System.out.println(x);
        }
    }
}
