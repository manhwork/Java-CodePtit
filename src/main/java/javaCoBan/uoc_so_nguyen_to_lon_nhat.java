package javaCoBan;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class uoc_so_nguyen_to_lon_nhat {

    private static Scanner sc = new Scanner(System.in);

    private static long ptich(long n) {
        long result = 0;
        for (long i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                    result = i;
                }
            }
        }
        if (n != 1) {
            result = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(ptich(n));
        }
    }
}
