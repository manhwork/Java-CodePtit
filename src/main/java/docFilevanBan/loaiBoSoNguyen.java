/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class loaiBoSoNguyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> v = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int number = Integer.parseInt(s);
            } catch (Exception e) {
                v.add(s);
            }
        }
        Collections.sort(v);
        for (String x : v) {
            System.out.print(x + " ");
        }
    }
}

//12 3 4 5 6 7
//Aaa 1 1 Bbb XXX yyy 5 5
//999999999999999999999999
//9
