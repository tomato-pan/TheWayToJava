package algorithm.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]),i};
            }
            map.putIfAbsent(nums[i],i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3, 2, 15}, 4)));

    }
}
