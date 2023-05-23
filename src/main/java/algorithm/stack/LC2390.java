package algorithm.stack;

import com.sun.deploy.util.StringUtils;

import java.util.Stack;

public class LC2390 {
    public static String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*'){
                stack.pop();
            }
            else {
                stack.add(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s1 : stack) {
            sb.append(s1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
