/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author MTQV
 */
public class so_khac_nhau_trong_file_1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\MTQV\\Documents\\GitHub\\Java-CodePtit\\src\\main\\java\\docFilevanBan\\DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> x : set) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
