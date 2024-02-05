package algorithm.DP;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC1696 {
    public static int maxResult(int[] nums, int k) {
        int[] fn = new int[nums.length];
        fn[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int mx = Integer.MIN_VALUE;
            for (int j = Math.max(i - k, 0); j < i; j++) {
                mx = Math.max(mx, fn[j]);
            }
            fn[i] = mx + nums[i];
        }
        return fn[nums.length - 1];
    }

    public static int maxResult1(int[] nums, int k) {
        int n = nums.length;
        int[] f = new int[n];
        f[0] = nums[0];
        Deque<Integer> q = new ArrayDeque<>();
        q.add(0);
        for (int i = 1; i < n; i++) {
            // 1. 出
            if (q.peekFirst() < i - k) {
                q.pollFirst();
            }
            // 2. 转移
            f[i] = f[q.peekFirst()] + nums[i];
            // 3. 入
            while (!q.isEmpty() && f[i] >= f[q.peekLast()]) {
                q.pollLast();
            }
            q.add(i);
        }
        return f[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(maxResult(new int[] {1,-1,-2,4,-7,3},2));
        System.out.println(maxResult1(new int[] {1,-1,-2,4,-7,3},2));
    }
}
