package javaapplication3.javaCoBan;

import java.util.Scanner;

public class tinhSoFibonaci {
    static long f[] = new long[100];
    public static void fibo(){
        f[1]=f[2]=1;
        for(int i=3;i<=93;i++){
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
        fibo();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
        sc.close();
    }
}
