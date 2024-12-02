///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package quanHeGiuaCacLop;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
///**
// *
// * @author MTQV
// */
//class SinhVien {
//
//    private String id, name, phone, groupId;
//
//    public SinhVien(String id, String name, String phone, String groupId) {
//        this.id = id;
//        this.name = name;
//        this.phone = phone;
//        this.groupId = groupId;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getGroupId() {
//        return groupId;
//    }
//
//    public void setGroupId(String groupId) {
//        this.groupId = groupId;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s %s", id, name, phone, groupId);
//    }
//
//}
//
//class Group {
//
//    private String id, name;
//
//    public Group(String id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
//
//}
//
//public class quanLyBaiTapNhom2 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        sc.nextLine();
//        Map<String, SinhVien> mapSinhVien = new TreeMap<>();
//        HashMap<String, Group> mapGroup = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String id = sc.nextLine();
//            SinhVien p = new SinhVien(id, sc.nextLine(), sc.nextLine(), sc.nextLine());
//            mapSinhVien.put(id, p);
//        }
//        for (int i = 0; i < m; i++) {
//            String id = String.valueOf(i + 1);
//            Group p = new Group(id, sc.nextLine());
//            mapGroup.put(id, p);
//        }
//        mapSinhVien.forEach((key, val) -> {
//            System.out.println(val + " " + mapGroup.get(val.getGroupId()));
//        });
//    }
//}
//
////5 2
////B17DTCN001
////Nguyen Chi  Linh
////0987345543
////1
////B17DTCN011
////Vu Viet Thang
////0981234567
////1
////B17DTCN023
////Pham Trong Thang
////0992123456
////1
////B17DTCN022
////Nguyen Van  Quyet
////0977865432
////2
////B17DTCN031
////Ngo Thanh Vien
////0912313111
////2
////Xay dung website ban dien thoai truc tuyen
////Xay dung ung dung quan ly benh nhan Covid-19
