package algorithm.map;

import java.util.*;
import java.util.stream.Collectors;

public class LC1657 {

    public static boolean closeStrings(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        // 1. 验证长度相同
        if (len1 != len2) {
            return false;
        }

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (int i = 0; i < len1; i++) {
            char c1 = word1.charAt(i);
            map1[c1 - 'a'] ++;
            char c2 = word2.charAt(i);
            map2[c2 - 'a'] ++;
        }
        // 2. 验证字符种类相同
        for (int i = 0; i < 26; i++) {
            if ((map1[i] > 0 && map2[i] == 0)
                    || map1[i] == 0 && map2[i] > 0) {
                return false;
            }
        }

        Arrays.sort(map1);
        Arrays.sort(map2);
        // 3. 验证字符频次相同
        for (int i = 0; i < 26; i++) {
            if (map1[i] != map2[i]) {
                return false;
            }
        }

        return true;

    }
}
