///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package quanHeGiuaCacLop;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
///**
// *
// * @author MTQV
// */
//class Product {
//
//    private String id, name;
//    private int price1, price2;
//
//    public Product(String id, String name, int price1, int price2) {
//        this.id = id;
//        this.name = name;
//        this.price1 = price1;
//        this.price2 = price2;
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
//    public int getPrice1() {
//        return price1;
//    }
//
//    public void setPrice1(int price1) {
//        this.price1 = price1;
//    }
//
//    public int getPrice2() {
//        return price2;
//    }
//
//    public void setPrice2(int price2) {
//        this.price2 = price2;
//    }
//
//}
//
//class Order {
//
//    private String id;
//    private String productName;
//    private int quantity;
//    private int discount, price;
//
//    public Order(String id, int quantity, int discount, int price, String productName) {
//        this.id = id;
//        this.quantity = quantity;
//        this.discount = discount;
//        this.price = price;
//        this.productName = productName;
//    }
//
//    public int getDiscount() {
//        return discount;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public void setDiscount(int discount) {
//        this.discount = discount;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
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
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %d %d", id, productName, discount, price);
//    }
//
//}
//
//public class tinhHoaDonBanQuanAo {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        HashMap<String, Product> mapProduct = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String id = sc.nextLine();
//            Product p = new Product(id, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//            mapProduct.put(id, p);
//        }
//        int m = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < m; i++) {
//            String[] line = sc.nextLine().trim().split("\\s+");
//            String id = line[0];
//            int quantity = Integer.parseInt(line[1]);
//            String productId = id.substring(0, 2);
//            String typePrice = id.substring(2);
//            Product product = mapProduct.get(productId);
//            String productName = product.getName();
//            String fullCode = id + String.format("-%03d", i + 1);
//            int currentPrice = "1".equals(typePrice) ? product.getPrice1() : product.getPrice2();
//            int price = currentPrice * quantity;
//            int discount = 0;
//            if (quantity >= 150) {
//                discount = (int) ((price) * 0.5);
//            } else if (quantity >= 100) {
//                discount = (int) ((price) * 0.3);
//            } else if (quantity >= 50) {
//                discount = (int) ((price) * 0.15);
//            }
//
//            Order p = new Order(fullCode, quantity, discount, price-discount, productName);
//            System.out.println(p);
//        }
//    }
//}
////2
////AT
////Ao thun
////80000
////45000
////QJ
////Quan Jean
////220000
////125000
////2
////AT1 95
////QJ2 105
