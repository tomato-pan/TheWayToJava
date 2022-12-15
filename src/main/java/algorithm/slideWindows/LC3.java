package algorithm.slideWindows;

import org.omg.CORBA.MARSHAL;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC3 {
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < length; end++){
            char element = s.charAt(end);
            if(map.containsKey(element)){
                start = Math.max(map.get(element) + 1, start); //map.get()的地方进行+1操作
            }
            max = Math.max(max, end - start + 1);
            map.put(element, end);
        }
        return max;

    }

    public static int lengthOfLongestSubstring1(String s) {
        int [] charMap = new int[256];
        int start = 0, res =0;
        for(int end = 0; end < s.length(); end++){
            int index = s.charAt(end);
            start = Math.max(start,charMap[index]);
            res = Math.max(res, end - start + 1);
            charMap[index]=end+1;
            System.out.println(res+","+start+","+end);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring1("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("   "));
    }
}
