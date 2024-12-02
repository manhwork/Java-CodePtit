/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanHeGiuaCacLop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MTQV
 */
class Customer {

    String id, name, gender, dob, address;

    public Customer(int id, String name, String gender, String dob, String address) throws ParseException {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.gender = gender;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dob = sdf.format(sdf.parse(dob));
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, address);
    }

}

class Product {

    String id, name, unit;
    int pricePurchase, priceSale;

    public Product(int id, String name, String unit, int pricePurchase, int priceSale) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.pricePurchase = pricePurchase;
        this.priceSale = priceSale;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPricePurchase() {
        return pricePurchase;
    }

    public void setPricePurchase(int pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }

}

class Order {

    String id;
    int quantity;
    Customer customer;
    Product product;
    int total;
    int ln;

    public Order(int id, int quantity, Customer customer, Product product, int total) {
        this.id = String.format("HD%03d", id);
        this.quantity = quantity;
        this.customer = customer;
        this.product = product;
        this.total = total;
        this.ln = (product.getPriceSale() - product.getPricePurchase()) * quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getLn() {
        return ln;
    }

    public void setLn(int ln) {
        this.ln = ln;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", id, customer, product, quantity, total,ln);
    }

}

public class quanLyBanHang2 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Map<String, Customer> mapCustomer = new HashMap<>();
        Map<String, Product> mapProduct = new HashMap<>();
        ArrayList<Order> v = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            Customer p = new Customer(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mapCustomer.put(p.getId(), p);
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            Product p = new Product(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            mapProduct.put(p.getId(), p);
        }
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            String customerId = line[0];
            String productId = line[1];
            int quantity = Integer.parseInt(line[2]);
            Customer customer = mapCustomer.get(customerId);
            Product product = mapProduct.get(productId);
            int total = product.getPriceSale() * quantity;
            Order o = new Order(i, quantity, customer, product, total);
            v.add(o);
        }
        Collections.sort(v, (o1, o2) -> {
            return (o2.getLn()) - o1.getLn();
        });
        for (Order x : v) {
            System.out.println(x);
        }
    }
}

//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4
