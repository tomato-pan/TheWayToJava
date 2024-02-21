package algorithm.List;

public class LC27 {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;

        // 快指针fast遍历整个数组：
        for (int i = 0; i < nums.length; i++) {
            if ( nums[fast] != val) {
                // 如果nums[fast]遇到值不为val的元素
                // 则与nums[slow]交换
                int tmp = nums[slow];
                nums[slow]= nums[fast];
                nums[fast]= tmp;
                // 此时slow及其左侧都是不等于val的元素，slow右移从而存储下一个不等于val的元素
                slow++;
                // fast右移从而寻找下一个等于val的元素
                fast++;
            } else {
                // 如果nums[fast]遇到值为val的元素，则跳过该元素，fast右移从而寻找下一个等于val的元素
                fast++;
            }
        }
        return slow;
    }
}
