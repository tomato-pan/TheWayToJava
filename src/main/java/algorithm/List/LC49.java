package algorithm.List;

import java.util.*;

public class LC49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String code = encode(str);
            map.putIfAbsent(code, new ArrayList<>());
            map.get(code).add(str);
        }
        return new ArrayList<>(map.values());
//        // 标记加过的index
//        Set<Integer> indexSet = new HashSet<>();
//        for (int i = 0; i < strs.length; i++) {
//            if (indexSet.contains(i)) {
//                continue;
//            }
//            List<String> res1 = new ArrayList<>();
//            res1.add(strs[i]);
//            for (int j = i + 1; j < strs.length; j++) {
//                if (strs[i].length()==strs[j].length()&& isEDiff(strs[i],strs[j])) {
//                    res1.add(strs[j]);
//                    indexSet.add(j);
//                }
//            }
//            if (res1.size() > 0) {
//                res.add(res1);
//            }
//        }
//        return res;
}

    private static char[] countChar(String str) {
        char[] maps = new char[26];
        for (int i = 0; i < str.length(); i++) {
            char cs = str.charAt(i);
            maps[cs - 'a'] += 1;
        }
        return maps;
    }

    private static String encode(String str) {
        char[] chars = new char[26];
        for (int i = 0; i < str.length(); i++) {
            char cs = str.charAt(i);
            chars[cs - 'a'] += 1;
        }
        return new String(chars);
    }

    private static Boolean isEDiff(String str, String str2) {
        char[] maps = new char[26];
        for (int i = 0; i < str.length(); i++) {
            char cs = str.charAt(i);
            maps[cs - 'a'] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            char tc = str2.charAt(i);
            maps[tc - 'a'] -= 1;
        }
        for (int i = 0; i < 26; i++) {
            if (maps[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
