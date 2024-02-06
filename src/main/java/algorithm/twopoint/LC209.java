package algorithm.twopoint;

public class LC209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, sum = 0, left = 0, count = n + 1;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                count = Math.min(count, i - left+1);
                sum -= nums[left];
                left++;
            }
        }
        return count > n ? 0 : count;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}
