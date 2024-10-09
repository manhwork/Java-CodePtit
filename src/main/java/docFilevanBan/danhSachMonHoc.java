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
class MonHoc {

    String ma, name, tc;

    public MonHoc(String ma, String name, String tc) {
        this.ma = ma;
        this.name = name;
        this.tc = tc;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", ma, name, tc);
    }

}

public class danhSachMonHoc {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        MonHoc[] p = new MonHoc[n];
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String tc = sc.nextLine();
            p[i] = new MonHoc(ma, name, tc);
        }
        Arrays.sort(p, (o1, o2) -> {
            return o1.name.compareTo(o2.name);
        });
        for (MonHoc x : p) {
            System.out.println(x);
        }
    }
}

//2
//INT1155
//Tin hoc co so 2
//2
//SKD1103
//Ky nang tao lap Van ban
//1