/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author MTQV
 */
public class soNguyenToTrongFileNhiPhan {

    private static boolean snt(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream data = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> p = (ArrayList<Integer>) data.readObject();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int x : p) {
            if (snt(x)) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}
