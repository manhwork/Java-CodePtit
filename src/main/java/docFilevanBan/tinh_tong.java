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
public class tinh_tong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\MTQV\\Documents\\GitHub\\Java-CodePtit\\src\\main\\java\\docFilevanBan\\DATA.in"));
//        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
            }
        }
        System.out.println(sum);
    }
}
