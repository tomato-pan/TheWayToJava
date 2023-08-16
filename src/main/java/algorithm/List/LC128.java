package algorithm.List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC128 {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int count =0;
        int ans = 0;
        // 遍历去重后的所有数字
        for (int num : numSet) {
            int cur = num;
            // 只有当num-1不存在时，才开始向后遍历num+1，num+2，num+3......
            if (!numSet.contains(cur - 1)) {
                while (numSet.contains(cur + 1)) {
                    cur++;
                }
            }
            // [num, cur]之间是连续的，数字有cur - num + 1个
            ans = Math.max(ans, cur - num + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println(longestConsecutive(new int[]{0}));
        System.out.println(longestConsecutive(new int[]{1,2,0,1}));
    }
}
