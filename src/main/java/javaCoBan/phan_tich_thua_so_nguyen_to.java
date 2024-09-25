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
public class phan_tich_thua_so_nguyen_to {

    public static String ptich(int n) {
        String s = "";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                s += i + "(" + cnt + ")" + " ";
            }
        }

        if (n != 1) {
            s += n + "(" + "1" + ")" + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int T = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println("Test " + T + ": " + ptich(n));
            T++;
        }
    }
}
