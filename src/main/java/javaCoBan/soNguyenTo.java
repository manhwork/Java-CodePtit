package javaapplication3.javaCoBan;

import java.util.Scanner;

public class soNguyenTo {
    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            System.out.println(snt(n) ? "YES" : "NO");
        }
        sc.close();
    }
}
