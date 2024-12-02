/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanHeGiuaCacLop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MTQV
 */
class GiangVien {

    String id, name;
    Float total;
    String monhocId;

    public GiangVien(String id, Float total, String monhocId) {
        this.id = id;
        this.total = total;
        this.monhocId = monhocId;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", name, total);
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getMonhocId() {
        return monhocId;
    }

    public void setMonhocId(String monhocId) {
        this.monhocId = monhocId;
    }

    public GiangVien(int id, String name) {
        this.id = String.format("GV%02d", id);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class MonHoc {

    String id, name;

    public MonHoc(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class bangTinhGioChuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, GiangVien> mapGiangVien = new HashMap<>();
        Map<String, MonHoc> mapMonHoc = new HashMap<>();
        Map<String, GiangVien> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            String s = "";
            for (int j = 1; j < line.length; j++) {
                s += line[j] + " ";
            }
            MonHoc p = new MonHoc(line[0], s);
            mapMonHoc.put(line[0], p);
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            int id = Integer.parseInt(line[0]);
            String s = "";
            for (int j = 1; j <= line.length; i++) {
                s += line[j] + " ";
            }
            GiangVien p = new GiangVien(id, s);
            mapGiangVien.put(p.getId(), p);
        }
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            String giangvienId = line[0];
            String monhocId = line[1];
            Float total = Float.valueOf(line[2]);
            if (map.containsKey(giangvienId)) {
                Float oldTotal = map.get(giangvienId).getTotal();
                map.get(giangvienId).setTotal(total + oldTotal);
            } else {
                map.put(giangvienId, new GiangVien(giangvienId, total, monhocId));
            }
        }
        map.forEach((key, val) -> {
            System.out.println(val);
        });
    }
}

//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72
