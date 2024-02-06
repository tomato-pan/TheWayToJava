package algorithm.twopoint;

public class LC713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, left = 0, prod = 1, count = 0;
        if (k <= 1) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            prod *= nums[i];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            count += i - left + 1;
        }
        return count;
    }
}
