package algorithm.List;

import java.util.Arrays;

public class LC1480RunningSum {
    public static int[] runningSum(int[] nums) {
//        int sums = 0, i = 0;
//        int[] res = new int[nums.length];
//        for (int num : nums) {
//            sums += num;
//            res[i]=sums;
//            i++;
//        }
//        return res;
        for (int j = 1; j < nums.length; j++) {
            nums[j] = nums[j - 1] + nums[j];
        }
        return nums;
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (countSum(nums,0,i) == countSum(nums,i+1,nums.length)){
                return i;
            }
        }
        return -1;
    }
    public static int countSum(int[] nums,int begin,int end){
        int sums=0;
        for (int i = begin; i < end; i++) {
            sums+=nums[i];
        }
        return sums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
