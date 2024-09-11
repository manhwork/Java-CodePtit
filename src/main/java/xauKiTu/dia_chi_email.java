/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xauKiTu;

import java.util.*;

/**
 *
 * @author admin
 */
public class dia_chi_email {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            String tmp = s[s.length - 1];
            for (int i = 0; i < s.length - 1; i++) {
                tmp += s[i].charAt(0);
            }
            if (!map.containsKey(tmp)) {
                map.put(tmp, 1);
            } else {
                int index = map.get(tmp);
                map.put(tmp, index + 1);
                tmp += "" + (index + 1);
            }
            tmp += "@ptit.edu.vn";
            System.out.println(tmp);
        }
    }
}
//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH
