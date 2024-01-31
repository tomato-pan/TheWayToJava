package algorithm.List;

import java.util.HashSet;
import java.util.Set;

public class LC2670 {

    public static int[] distinctDifferenceArray(int[] nums) {
        int len = nums.length;
        int[] diff = new int[len];
        for (int i = 0; i < len; i++) {
            int a = 0;
            Set<Integer> setB = new HashSet();
            Set<Integer> setA = new HashSet();
            while (a <= i) {
                setB.add(nums[a]);
                a++;
            }
            int j = i+1;
            while (j < len) {
                setA.add(nums[j]);
                j++;
            }
            diff[i]=setB.size()-setA.size();
        }
        return diff;
    }

    public int[] distinctDifferenceArrayNew(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];    // 结果数组
        Set<Integer> set = new HashSet<>(); // 存储出现的不同元素
        // 先统计前缀和，注意前缀和是范围[0, i]，因此先添加nums[i]，再统计不同元素数目
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
            diff[i] = set.size();
        }
        set.clear();    // 清空哈希表
        // 再统计后缀和，注意后缀和是范围[i+1 n)，因此先统计不同元素数目，再添加nums[i]
        for(int i = n - 1; i >= 0; i--){
            diff[i] -= set.size();  // diff[i]存储的是[0,i]的前缀和，直接做差就得到结果
            set.add(nums[i]);
        }
        return diff;
    }

    public static void main(String[] args) {
        distinctDifferenceArray(new int[] {1,2,3,4,5});
    }
}
