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
public class hello_file {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }

    }
}
