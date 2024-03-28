package algorithm.DP;

import java.util.Arrays;

/**
 * @Author: tomato
 * @CreateTime: 2024-03-24  18:07
 * @Description: TODO
 * @Version: 1.0
 */
public class LC322 {
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] f = new int[n + 1][amount + 1];
        Arrays.fill(f[0], Integer.MAX_VALUE / 2);
        f[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (j < coins[i]) {
                    f[i + 1][j] = f[i][j];
                } else {
                    f[i + 1][j] = Math.min(f[i][j], f[i+1][j - coins[i]] + 1);
                }
            }
        }
        int ans = f[n][amount];
        System.out.println(Arrays.deepToString(f));
        return ans < Integer.MAX_VALUE / 2 ? ans : -1;
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }
}
