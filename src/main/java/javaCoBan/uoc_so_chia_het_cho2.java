/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaCoBan;

//import static java.lang.Math.*;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class uoc_so_chia_het_cho2 {

    private static Scanner sc = new Scanner(System.in);

    private static long uocSo(long n) {
        long cnt = 0;
        for (long i = 1; i < sqrt(n); i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    cnt++;
                }
                if ((n / i) % 2 == 0) {
                    cnt++;
                }
            }
        }
        if ((float) sqrt(n) == (long) sqrt(n)) {
            if (sqrt(n) % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(uocSo(n));
        }
    }
}
