package algorithm.slideWindows;

import java.util.Stack;

public class LC643 {
    public static double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 0,j=k; i < nums.length && j<nums.length; i++,j++) {
            int temp = sum-nums[i]+nums[j];
            sum = Math.max(temp,sum);
        }
        return (double) sum/k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(findMaxAverage(new int[]{5}, 1));
        System.out.println(findMaxAverage(new int[]{-1}, 1));
    }
}
/*
给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。

请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。

任何误差小于 10-5 的答案都将被视为正确答案。

 

示例 1：

输入：nums = [1,12,-5,-6,50,3], k = 4
输出：12.75
解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
示例 2：

输入：nums = [5], k = 1
输出：5.00000

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/maximum-average-subarray-i
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
