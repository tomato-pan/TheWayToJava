package fundamental.java_012;

import java.util.Stack;

public class maxDepth {
    public static void main(String[] args) {
        String s = "1+(2*3)/(2-1)";
        Stack<String> stack = new Stack<>();
        int count = 0;
        if (!s.contains("(")){
            System.out.println(0);;}
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == '('){
                stack.push("(");
            }
            if (s.charAt(i) == ')'){
                count=Math.max(stack.size(),count);
                stack.pop(); }
        }
        System.out.println(count);
    }
}
