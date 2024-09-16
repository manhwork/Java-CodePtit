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
            for(char c : s.toCharArray()){
                if (c == '0') {
                    
                }
            }
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    tmp += "1";
                } else if (c == '8' || c == '0' || c == '9') {
                    tmp += "0";
                } else {
                    ok = true;
                    break;
                }
            }
            tmp = tmp.replaceFirst("^0+(?!$)","");
            System.out.println(ok || tmp == "0" ? "INVALID" : tmp);
        }
    }
}