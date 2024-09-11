package javaCoBan;

import java.util.Scanner;

/**
 * cat_doi
 */
public class cat_doi {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String tmp = "";
            Boolean ok = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    tmp += '1';
                } else if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                    tmp += '0';
                } else {
                    ok = true;
                    break;
                }
            }
            int l = 0;
            while (l < tmp.length() && tmp.charAt(l) == '0') {
                l++;
            }
            
            if(l == tmp.length() )ok = true;
            
            if (ok ){
                System.out.println("INVALID");
            }
            else {
                System.out.println(tmp.substring(l));
            }
            
        }
    }
}
