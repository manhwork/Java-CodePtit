package javaCoBan;

import static java.lang.Math.abs;
import java.util.Scanner;

public class so_khong_lien_ke {

    private static Scanner sc = new Scanner(System.in);

    private static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (abs((int) (s.charAt(i) - '0') - (int) (s.charAt(i + 1) - '0')) != 2) {
                return false;
            }
        }
        return true;
    }

    private static boolean check2(String s) {
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int) (s.charAt(i) - '0');
        }
        return sum % 10 == 0;
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            System.out.println(check(s) && check2(s) ? "YES" : "NO");
        }
    }

}
