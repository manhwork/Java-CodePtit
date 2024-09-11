package javaCoBan;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class tong_uoc_so_1 {

    private static final Scanner sc = new Scanner(System.in);
    private static final int N = (int) 2e6;
    private static final int[] prime = new int[N + 5];

//    Tính số nguyên tố nhỏ nhất của n 
    private static void ptich() {
        for (int i = 2; i <= sqrt(N); i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    if (prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (prime[i] == 0) {
                prime[i] = i;
            }
        }
    }

    private static long caculation(int n) {
        if (prime[n] == 0) {
            return n;
        }
        long sum = 0;
        while (n != 1) {
            sum += prime[n];
            n /= prime[n];
        }
        return sum;
    }

    public static void main(String[] args) {
        ptich();
        int t = sc.nextInt();
        long tong = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            tong += caculation(n);
        }
        System.out.println(tong);
    }

}
