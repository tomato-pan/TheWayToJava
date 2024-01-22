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

    public static int[] topKFrequent1(int[] nums, int k) {
        List<Integer> res = new ArrayList();
        // 使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
        HashMap<Integer,Integer> map = new HashMap();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //桶排序
        //将频率作为数组下标，对于出现频率不同的数字集合，存入对应的数组下标
        List<Integer>[] list = new List[nums.length+1];
        for(int key : map.keySet()){
            // 获取出现的次数作为下标
            int i = map.get(key);
            if(list[i] == null){
                list[i] = new ArrayList();
            }
            list[i].add(key);
        }

        // 倒序遍历数组获取出现顺序从大到小的排列
        for(int i = list.length - 1;i >= 0 && res.size() < k;i--){
            if (list[i] != null) {
                res.addAll(list[i].subList(0, Math.min(list[i].size(), k - res.size())));
            }
        }
        int[] result = new int[res.size()];
        int index = 0;
        for (int num : res) {
            result[index++] = num;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2}, 2)));
    }
}
