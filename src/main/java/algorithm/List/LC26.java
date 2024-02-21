package algorithm.List;

public class LC26 {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;

        // 快指针fast遍历整个数组：
        while (fast < nums.length) {
            System.out.println("slow:"+slow+"  fast:"+fast+" num:"+nums[slow]);
            if (nums[slow] != nums[fast]) {
                nums[slow + 1] = nums[fast];
                slow++;
            } else {
                fast++;
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
