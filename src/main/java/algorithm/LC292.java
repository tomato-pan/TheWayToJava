package algorithm;

public class LC292 {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] f = new int[n + 2][n + 2];
        for (int len = 1; len <= n; len++) { // 枚举区间长度
            for (int l = 1; l + len - 1 <= n; l++) { // 枚举左端点
                int r = l + len - 1; // 计算右端点
                int a = piles[l - 1] - f[l + 1][r];
                int b = piles[r - 1] - f[l][r - 1];
                f[l][r] = Math.max(a, b);
            }
        }
        return f[1][n] > 0;
    }

    public boolean xorGame(int[] nums) {
        int xof = 0;
        for (int i : nums) xof ^= i;
        return xof == 0 || nums.length % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(stoneGame(new int[] {5,3,4,5}));
        System.out.println(stoneGame(new int[] {3,7,2,3}));
    }
}
