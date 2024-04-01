package algorithm.List;

/**
 * @Author: tomato
 * @CreateTime: 2024-03-28  20:35
 * @Description: TODO
 * @Version: 1.0
 */
public class LC1997 {
    public static int firstDayBeenInAllRooms(int[] nextVisit) {
        final long MOD = 1_000_000_007;
        int n = nextVisit.length;
        long[] s = new long[n];
        for (int i = 0; i < n - 1; i++) {
            int j = nextVisit[i];
            s[i + 1] = (s[i] * 2 - s[j] + 2 + MOD) % MOD; // + MOD 避免算出负数
        }
        return (int) s[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(firstDayBeenInAllRooms(new int[]{0,0}));
        System.out.println(firstDayBeenInAllRooms(new int[]{0,0,2}));
        System.out.println(firstDayBeenInAllRooms(new int[]{0,1,2,0}));
    }
}
