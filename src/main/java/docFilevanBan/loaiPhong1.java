/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class LoaiPhong implements Comparable<LoaiPhong> {

    String name;
    String line;

    public LoaiPhong(String line) {
        this.line = line;
        String[] s = line.trim().split("\\s+");
        name = s[1];
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return line;
    }

}

public class loaiPhong1 {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
//        Scanner in = new Scanner(new File("PHONG.in"));
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}

//2
//C THUONG 150 0.03
//B VIP 200 0.05