package javaCoBan;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MTQV
 */
public class kiem_tra_so_fibonacci {

    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo = new long[100];

    public static void prepare() {
        fibo[0] = 0L;
        fibo[1] = 1L;
        for (int i = 2; i < 100; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static boolean isFibo(long n) {
        for (long i : fibo) {
            if (i == n) {
                return true;
            } else if (i > n) {
                return false;
            }
        }
        return false;
    }

    public static void testCase() {
        long n = sc.nextLong();
        if (isFibo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        prepare();
        int T = sc.nextInt();
        while (T-- > 0) {
            testCase();
        }
    }
}
