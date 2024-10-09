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
class SinhVien1 {

    String ma, name, lop, email;

    public SinhVien1(String ma, String name, String lop, String email) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public void chuanHoa() {
        String[] s = name.toLowerCase().trim().split("\\s+");
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        }
        name = String.join(" ", s);
    }

    @Override
    public String toString() {
        chuanHoa();
        return String.format("%s %s %s %s", ma, name, lop, email);
    }

}

public class danhSachSinhVienTrongFile_1 {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SinhVien1[] p = new SinhVien1[n];
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            p[i] = new SinhVien1(ma, name, lop, email);
        }
        Arrays.sort(p, (o1, o2) -> {
            return o1.ma.compareTo(o2.ma);
        });
        for (SinhVien1 x : p) {
            System.out.println(x);
        }
    }
}

//2
//B15DCKT150
//NGUYEN NGOC SON
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//NguyeN   TrONg Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
