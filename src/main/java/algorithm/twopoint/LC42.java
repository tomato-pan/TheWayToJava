package algorithm.twopoint;

import java.util.Arrays;

public class LC42 {
    public int trap(int[] height) {
        int n = height.length;
        int[] preMax = new int[n];
        int[] sufMax = new int[n];
        Arrays.fill(preMax, 0);
        Arrays.fill(sufMax, 0);
        int res = 0;
        preMax[0]=height[0];
        for (int i = 1; i < n; i++) {
            preMax[i] = Math.max(preMax[i-1],height[i]);
        }
        sufMax[n-1]=height[n-1];
        for (int i = n - 2; i >= 0; i--) {
            sufMax[i] = Math.max(sufMax[i + 1], height[i]);
        }
        for (int i = 0; i < n; i++) {
            res += Math.min(sufMax[i], preMax[i]) - height[i];
        }
        return res;
    }

    public int trap2(int[] height) {
        int left = 0, right = height.length - 1,res = 0, preMax = 0, sufMax = 0;
        while (left < right) {
            preMax = Math.max(preMax, height[left]);
            sufMax = Math.max(sufMax, height[right]);
            if (preMax < sufMax) {
                res += preMax - height[left];
                left++;
            } else {
                res += sufMax - height[right];
                right--;
            }
        }
        return res;
    }

}
