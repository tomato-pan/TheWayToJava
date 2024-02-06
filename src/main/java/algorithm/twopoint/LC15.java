package algorithm.twopoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            int a = nums[i];
            if (i > 0 && a == nums[i - 1]) {
                continue;
            }
            if (a+nums[i+1]+nums[i+2]>0){
                break;
            }
            if (a+nums[n-1]+nums[n-2]<0){
                continue;
            }
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = a + nums[l] + nums[r];
                if (sum > 0) {
                    --r;
                } else if (sum < 0) {
                    ++l;
                } else {
                    List<Integer> list = Arrays.asList(a, nums[l], nums[r]);
                    res.add(list);
                    for (++l; l < r && nums[l] == nums[l - 1]; ++l); // 跳过重复数字
                    for (--r; r > l && nums[r] == nums[r + 1]; --r); // 跳过重复数字
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int a = nums[i];
            if (i > 0 && a == nums[i - 1]) {
                continue;
            }
            if (a+nums[i+1]+nums[i+2]>0){
                break;
            }
            if (a+nums[nums.length-1]+nums[nums.length-2]<0){
                continue;
            }
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = a + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    List<Integer> list = Arrays.asList(a, nums[l], nums[r]);
                    res.add(list);
                    l++;
                    while (nums[l] == nums[l - 1] && l < r) l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{-2, -2, 0, 0, 2, 2}));
        System.out.println(threeSum(new int[]{-1,0,1}));
    }
}
