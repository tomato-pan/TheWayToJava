package algorithm.twopoint;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray(); // 转换成 char[] 加快效率（忽略带来的空间消耗）
        int n = chars.length, ans = 0, left = 0;
        boolean[] has = new boolean[128]; // 也可以用 HashSet<Character>，这里为了效率用的数组
        for (int right = 0; right < n; ++right) {
            char c = chars[right];
            while (has[c]) {
                // 加入 c 后，窗口内会有重复元素
                has[chars[left]] = false;
                left++;
            }
            has[c] = true;
            ans = Math.max(ans, right - left + 1); // 更新窗口长度最大值
        }
        return ans;
    }

    public static String substringA(String s) {
        return s.substring(s.length()/2)+s.substring(0,s.length()/2);
    }

    public static void main(String[] args) {
        System.out.println(substringA("abcdef"));
    }
}
