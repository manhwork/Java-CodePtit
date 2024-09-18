/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author MTQV
 */
public class liet_ke_tu_khac_nhau {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            set.add(s);
        }
        for (String x : set) {
            System.out.println(x);
        }
    }
}
