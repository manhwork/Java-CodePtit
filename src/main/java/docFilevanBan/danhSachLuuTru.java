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
 * @author admin
 */
class khachsan {

    String ma, name, phong, den, di;
    static int cnt = 1;
    Long lt;

    public khachsan(String name, String phong, String den, String di) throws ParseException {
        this.name = name;
        this.phong = phong;
        this.den = den;
        this.di = di;
        ma = "KH" + String.format("%02d", cnt++);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        lt = (formatDate.parse(di).getTime() - formatDate.parse(den).getTime()) / (1000 * 60 * 60 * 24);
//        convert second to day
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", ma, name, phong, lt);
    }

}

public class danhSachLuuTru {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        khachsan[] p = new khachsan[n];
        for (int i = 0; i < n; i++) {
            p[i] = new khachsan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(p, (o1, o2) -> {
            return o2.lt.compareTo(o1.lt);
        });
        for (khachsan x : p) {
            System.out.println(x);
        }
    }
}

//2
//Nguyen Van Hoang
//55B1
//01/01/2021
//05/01/2021
//Nguyen Trung Dung
//04C6
//01/01/2021
//10/01/2021
