/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author MTQV
 */
public class chuan_hoa_xau_ho_ten {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine();
            String tmp = "";
            if (s.equals("END")) {
                break;
            }
            String[] arr = s.trim().toLowerCase().split("\\s+");
            for (String token : arr) {
                token = token.substring(0, 1).toUpperCase() + token.substring(1);
                tmp += token + " ";
            }
            System.out.println(tmp);
        }
    }
}
