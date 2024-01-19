package algorithm.List;

import java.util.*;

public class LC347 {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        // key : 数字; value ：出现到频次
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            map.put(curNum, map.getOrDefault(curNum, 0) + 1);
        }
        // 根据 value 进行排序
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2}, 2)));
    }
}
