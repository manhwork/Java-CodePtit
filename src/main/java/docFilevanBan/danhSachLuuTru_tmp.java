/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MTQV
 */
class khach1 {
    
    String ma, name, phong, den, di;
    static int cnt = 1;
    Long lt;
    
    public khach1(String name, String phong, String den, String di) throws ParseException {
        ma = String.format("KH%02d", cnt++);
        this.name = name;
        this.phong = phong;
        SimpleDateFormat fdate = new SimpleDateFormat("dd/MM/yyyy");
        Date denDate = fdate.parse(den);
        Date diDate = fdate.parse(di);
        lt = (diDate.getTime() - denDate.getTime()) / (1000 * 60 * 60 * 24);
        this.den = den;
        this.di = di;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %d", ma, name, phong, lt);
    }
    
}

public class danhSachLuuTru_tmp {
    
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        khach1[] p = new khach1[n];
        for (int i = 0; i < n; i++) {
            p[i] = new khach1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(p, (o1, o2) -> {
            return o2.lt.compareTo(o1.lt);
        });
        for (khach1 x : p) {
            System.out.println(x);
        }
    }
}

//2
//Nguyen Van Hoang
//55B1
//01/1/2021
//05/1/2021
//Nguyen Trung Dung
//04C6
//01/1/2021
//10/1/2021
