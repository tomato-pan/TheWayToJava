package algorithm.DP;

import java.util.Arrays;

public class LC198 {
    public int rob1(int[] nums) {
        int n = nums.length;
//        int[] f = new int[n + 2];
//        Arrays.fill(f, 0);
        int f0 = 0,f1= 0;
        int newF = 0;
        for (int i = 0; i < n; i++) {
            newF = Math.max(f1,f0+nums[i]);
            f0=f1;
            f1 = newF;
        }
        return newF;
    }

    // 备忘录
    private int[] memo;

    // 主函数
    public int rob(int[] nums) {
        // 初始化备忘录
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        // 强盗从第 0 间房子开始抢劫
        return dp(nums, 0);
    }

    // 返回 dp[start..] 能抢到的最大值
    private int dp(int[] nums, int start) {
        if (start >= nums.length) {
            return 0;
        }
        // 避免重复计算
        if (memo[start] != -1) return memo[start];

        int res = Math.max(dp(nums, start + 1),
                nums[start] + dp(nums, start + 2));
        // 记入备忘录
        memo[start] = res;
        return res;
    }
}
