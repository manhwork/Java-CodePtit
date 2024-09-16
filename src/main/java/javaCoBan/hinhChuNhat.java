package javaapplication3.javaCoBan;

import java.util.Scanner;

public class hinhChuNhat {
    public static Number check(float a) {
        if (a - (int) a == 0) {
            return (int) a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float a = sc.nextFloat();
        Float b = sc.nextFloat();
        if (a > 0 && b > 0) {
            System.out.print(check((a + b) * 2) + " " + check(a * b));
            sc.close();
        }
        else {
            System.out.println(0);
        }
    }
}
