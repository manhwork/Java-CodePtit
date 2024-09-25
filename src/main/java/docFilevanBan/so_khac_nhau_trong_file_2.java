package docFilevanBan;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

public class so_khac_nhau_trong_file_2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 100000; i++) {
            int x = dis.readInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}
