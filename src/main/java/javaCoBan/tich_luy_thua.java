package javaCoBan;

import java.util.Scanner;

public class tich_luy_thua {

    private static final Scanner sc = new Scanner(System.in);
    private static final long N = (long) (10e9 + 7);

    public static void main(String[] args) {
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            long tich = (long)1;
            for (int i = 0; i < b; i++) {
                tich *= a;
                tich %= N;
            }
            System.out.println(tich);
        }
    }
}
