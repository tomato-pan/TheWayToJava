package algorithm.DP;

/**
 * @Author: tomato
 * @CreateTime: 2024-03-26  17:13
 * @Description: TODO
 * @Version: 1.0
 */
public class LC494 {
    public static int findTargetSumWays(int[] nums, int target) {
        for (int num : nums) {
            target += num;
        }
        target = target / 2;
        if (target < 0 || target % 2 != 0) {
            return 0;
        }
        int[][] f = new int[target][target];

        f[0][0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < target; j++) {
                if (j < nums[i]) {
                    f[i + 1][j] = f[i][j];
                } else {
                    f[i + 1][j] = f[i][j]+f[i][j-nums[i]];
                }
            }
        }
        return f[nums.length][target];
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1,1,1,1,1},  3));
    }
}
