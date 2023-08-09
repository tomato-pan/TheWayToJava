package algorithm.stack;

import com.sun.deploy.util.StringUtils;

import java.util.*;

public class LC2390 {
    public static String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.add(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s1 : stack) {
            sb.append(s1);
        }
        return sb.toString();
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> d = new ArrayDeque<>();
        for (int t : asteroids) {
            boolean ok = true;
            while (ok && !d.isEmpty() && d.peekLast() > 0 && t < 0) {
                int a = d.peekLast(), b = -t;
                if (a <= b) d.pollLast();
                if (a >= b) ok = false;
            }
            if (ok) d.addLast(t);
        }
        int sz = d.size();
        int[] ans = new int[sz];
        while (!d.isEmpty()) ans[--sz] = d.pollLast();
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5})));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, -5})));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, -10})));
        String a = "2";
        String b = "2";
        if (a.equals("1")){
            System.out.println(1);
        }else if (b.equals("2")){
            System.out.println(2);
        }
    }
}
