package algorithm.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1664 {
    public static int waysToMakeFair(int[] nums) {
        int s1 = 0, s2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            s1 += i % 2 == 0 ? nums[i] : 0;
            s2 += i % 2 == 1 ? nums[i] : 0;
        }
        int t1 = 0, t2 = 0;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int v = nums[i];
            ans += i % 2 == 0 && t2 + s1 - t1 - v == t1 + s2 - t2 ? 1 : 0;
            ans += i % 2 == 1 && t2 + s1 - t1 == t1 + s2 - t2 - v ? 1 : 0;
            t1 += i % 2 == 0 ? v : 0;
            t2 += i % 2 == 1 ? v : 0;
        }
        return ans;
    }
    public static int waysToMakeFair2(int[] nums) {
        // 预处理 even为偶数下标和 odd为奇数下标和
        int even = 0, odd = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                even += nums[i];
            } else {
                odd += nums[i];
            }
        }
        // pre_even 不受下标改变的偶数和 pre_odd 同理
        int ans = 0, pre_even = 0, pre_odd = 0;
        // 枚举每一个删除的下标
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                even -= nums[i];
            } else {
                odd -= nums[i];
            }
            // 删除后，后续数字的下标发生转换
            if (odd + pre_even == even + pre_odd) ans++;

            // 当前数字在后续的删除中不受下标改变
            if ((i & 1) == 0) {
                pre_even += nums[i];
            } else {
                pre_odd += nums[i];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(waysToMakeFair(new int[]{2, 1, 6, 4}));
        System.out.println(waysToMakeFair(new int[]{1,1,1}));
    }
}
