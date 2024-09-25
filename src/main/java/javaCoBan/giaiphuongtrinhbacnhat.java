package javaapplication3.javaCoBan;

import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float a = sc.nextFloat();
        Float b = sc.nextFloat();
        if(a == 0 && b != 0) System.out.println("VN");
        else if(a == 0 && b == 0) System.out.println("VSN");
        else {
            System.out.printf("%.2f",-b / a);
        }
        sc.close();
    }
}
