package javaCoBan;

import java.util.Scanner;

public class chu_so4_chu_so7 {

    private static Scanner sc = new Scanner(System.in);

    private static void testcase() {
        String s = sc.nextLine();
        int cnt4 = 0;
        int cnt7 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4') {
                cnt4++;
            } else if (s.charAt(i) == '7') {
                cnt7++;
            }
        }
        int tong = cnt4 + cnt7;
        System.out.println(tong == 4 || tong == 7 ? "YES" : "NO");
    }

    public static void main(String[] args) {
        testcase();
    }
}
