package fundamental.java_006;

import java.util.HashMap;

public class HashMapdemo1 {
    public static void main(String[] args) {

    }
    public int [] twoSum(int [] nums, int target){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < n; i++) {
            int other = target - nums[i];
            if (map.containsKey(other) && map.get(other) != i){
                return new int[]{i,map.get(other)};
            }
        }
        return new int[]{-1,-1};
    }
    // 如果数组有序
    public int [] twoSum1(int [] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++; // 让 sum 大一点
            } else {
                right--; // 让 sum 小一点
            }
        }
        // 不存在这样两个数
        return new int[]{-1, -1};
    }
}
