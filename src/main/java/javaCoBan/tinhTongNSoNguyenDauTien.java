package javaapplication3.javaCoBan;

import java.util.Scanner;

public class tinhTongNSoNguyenDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            int n = sc.nextInt();
            System.out.println((long)n * (n + 1) / 2);
        }
        sc.close();
    }
}
