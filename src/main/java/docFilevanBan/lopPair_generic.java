/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docFilevanBan;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class Pair<t1, t2> {

    t1 fi;
    t2 se;

    public Pair(t1 fi, t2 se) {
        this.fi = fi;
        this.se = se;
    }

    public boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public boolean isPrime() {
        return snt((Integer) fi) && snt((Integer) se);
    }

    @Override
    public String toString() {
        return fi + " " + se;
    }

}

public class lopPair_generic {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
//        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }
}
