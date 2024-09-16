package com.mycompany.java_ptit.javaMang;

import java.util.*;

public class thu_gon_day_so {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!stack.isEmpty() && (stack.peek() + x) % 2 == 0) {
                stack.pop();
            } else {
                stack.push(x);
            }
        }

        System.out.println(stack.size());
    }
}
