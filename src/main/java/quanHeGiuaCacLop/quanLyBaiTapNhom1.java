///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package quanHeGiuaCacLop;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//class SinhVien {
//
//    private String id;
//    private String name, phone;
//    private int groupID;
//
//    public SinhVien(String id, String name, String phone, int groupID) {
//        this.id = id;
//        this.name = name;
//        this.phone = phone;
//        this.groupID = groupID;
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
//    public int getGroupID() {
//        return groupID;
//    }
//
//    public void setGroupID(int groupID) {
//        this.groupID = groupID;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s", id, name, phone);
//    }
//
//}
//
//class Group {
//
//    private int id;
//    private String name;
//    private ArrayList<SinhVien> lSinhVien;
//
//    public Group(int id, String name) {
//        this.id = id;
//        this.name = name;
//        this.lSinhVien = new ArrayList<>();
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
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
//    public ArrayList<SinhVien> getlSinhVien() {
//        return lSinhVien;
//    }
//
//    public void setlSinhVien(ArrayList<SinhVien> lSinhVien) {
//        this.lSinhVien = lSinhVien;
//    }
//
//}
//
//public class quanLyBaiTapNhom1 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        sc.nextLine();
//        HashMap<Integer, Group> map = new HashMap<>();
//        for (int i = 1; i <= m; i++) {
//            map.put(i, new Group(i, ""));
//        }
//        for (int i = 0; i < n; i++) {
//            SinhVien p = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
//            map.get(p.getGroupID()).getlSinhVien().add(p);
//        }
//        for (int i = 1; i <= m; i++) {
//            String name = sc.nextLine();
//            map.get(i).setName(name);
//        }
//        int t = Integer.parseInt(sc.nextLine());
//        while (t-- > 0) {
//            int id = Integer.parseInt(sc.nextLine());
//            System.out.println(String.format("DANH SACH NHOM %d:", id));
//            for (SinhVien x : map.get(id).getlSinhVien()) {
//                System.out.println(x);
//            }
//            System.out.println(String.format("Bai tap dang ky: %s", map.get(id).getName()));
//        }
//    }
//}
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
////1
////1
