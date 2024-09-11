package javaCoBan;

import static java.lang.Math.abs;
import java.util.Scanner;

public class so_lien_ke {

    private static Scanner sc = new Scanner(System.in);

    private static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (abs( (int)(s.charAt(i) - '0') - (int)(s.charAt(i+1) - '0') ) != 1) {
                return false;
            }
        }
        return true ;
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            System.out.println(check(s) ? "YES" : "NO");
        }
    }
}
