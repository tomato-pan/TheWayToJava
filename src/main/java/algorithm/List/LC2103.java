package algorithm.List;

import java.util.Arrays;

public class LC2103 {
    /**
     * 总计有 n 个环，环的颜色可以是红、绿、蓝中的一种。这些环分别穿在 10 根编号为 0 到 9 的杆上。
     * <p>
     * 给你一个长度为 2n 的字符串 rings ，表示这 n 个环在杆上的分布。rings 中每两个字符形成一个 颜色位置对 ，用于描述每个环：
     * <p>
     * 第 i 对中的 第一个 字符表示第 i 个环的 颜色（'R'、'G'、'B'）。
     * 第 i 对中的 第二个 字符表示第 i 个环的 位置，也就是位于哪根杆上（'0' 到 '9'）。
     * 例如，"R3G2B1" 表示：共有 n == 3 个环，红色的环在编号为 3 的杆上，绿色的环在编号为 2 的杆上，蓝色的环在编号为 1 的杆上。
     * <p>
     * 找出所有集齐 全部三种颜色 环的杆，并返回这种杆的数量。
     * 输入：rings = "B0B6G0R6R0R6G9"
     * 输出：1
     *
     * @param rings
     * @return
     */

    public static int countPoints(String rings) {
        int cnt = 0;
        String[] nums = new String[10];
        Arrays.fill(nums,"");
        if (rings.length() < 6) {
            return cnt;
        }
        for (int i = 0; i < rings.length(); i += 2) {
            if (i + 1 < rings.length()) {
                String substring = rings.substring(i + 1, i + 2);
                String color = rings.substring(i, i + 1);
                nums[Integer.parseInt(substring)] += color;
            }else {
                String substring = rings.substring(i);
                String color = rings.substring(i-1, i );
                nums[Integer.parseInt(substring)] += color;
            }
        }
        for (String num : nums) {
            if (num.length()<3){
                continue;
            }
            if (num.contains("B") && num.contains("R") &&num.contains("G")){
                cnt++;
            }
        }
        return cnt;
    }

    public static int countPoints2(String rings) {
        int cnt = 0;
        int[] nums = new int[10];
        if (rings.length() < 6) {
            return cnt;
        }
        for (int i = 0; i < rings.length(); i += 2) {
           char c = rings.charAt(i);
           int idx, t=rings.charAt(i+1)-'0';
            if (c == 'R') idx = 0;
            else if (c == 'G') idx = 1;
            else idx = 2;
            nums[t] |= 1 << idx;
        }
        for (int i = 0; i < 10; i++) {
            if (nums[i] == (1 << 3) - 1) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
        System.out.println(countPoints2("B0B6G0R6R0R6G9"));
    }
}
