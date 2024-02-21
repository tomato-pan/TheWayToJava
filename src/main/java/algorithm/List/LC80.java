package algorithm.List;

public class LC80 {
    public static int removeDuplicates(int[] nums) {
        int k = 2; // 每个元素最多出现的次数
        if (nums.length <= k) return nums.length; // 如果数组长度小于等于 k，直接返回数组长度

        // 初始化慢指针和快指针
        int slow = k, fast = k;
        while (fast < nums.length) {
            // 如果 nums[fast] 不等于 nums[slow - k]
            // 则将 nums[fast] 复制到 nums[slow]，并将 slow 向前移动一位
            if (nums[slow - k] != nums[fast]) { //nums[slow - k] 是当前考虑的元素在新数组中的第一个可能的位置
                nums[slow] = nums[fast];
                slow++;
            }
            // 将 fast 向前移动一位，以检查下一个元素
            fast++;
        }
        // 返回新数组的长度
        return slow;
    }

    public static void main(String[] args) {
        /**
         * nums = [0,0,1,1,1,1,2,3,3]
         * 输出：7, nums = [0,0,1,1,2,3,3]
         */
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}
