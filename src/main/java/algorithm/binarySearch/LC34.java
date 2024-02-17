package algorithm.binarySearch;

public class LC34 {
    public int[] searchRange(int[] nums, int target) {
        int start = getInts(nums, target);
        if (start == nums.length) {
            return new int[]{-1, -1};
        }
        int end = getInts(nums,target+1)-1;
        return new int[]{start,end};
    }

    private int getInts(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = ((right - left) + left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
