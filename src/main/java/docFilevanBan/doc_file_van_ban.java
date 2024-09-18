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
public class doc_file_van_ban {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
