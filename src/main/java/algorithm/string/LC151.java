package algorithm.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LC151 {

    public static String reverseWords(String s) {
       String [] strings = s.trim().replaceAll("\\s+"," ").split(" ");
//        if (strings.length<=1){
//            return s;
//        }
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length-1; i >= 0; i--) {
            sb.append(strings[i]);
            if (i!=0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static String reverseWords2(String s) {
        s = s.trim();                                    // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;     // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while (i >= 0 && s.charAt(i) == ' ') i--;     // 跳过单词间空格
            j = i;                                       // j 指向下个单词的尾字符
        }
        return res.toString().trim();                    // 转化为字符串并返回
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("i am panj"));
        System.out.println(reverseWords(" am panj "));
        System.out.println(reverseWords2(" am panj "));
        System.out.println(reverseWords(" am "));
    }
}
