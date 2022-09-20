package algorithm.DP;

import java.util.List;

public class getCoins {
    public static int solution(int[] coins, Integer target) {
        int[] f = new int[target+1];
        int res;
        // f[i] = min(f[i-coin]+1,f[i])
        for (int i = 0; i < target; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                f[i] = Math.min(f[i - coin] + 1, f[i]);
            }
        }
        System.out.println(f);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 5},21));
    }
}
