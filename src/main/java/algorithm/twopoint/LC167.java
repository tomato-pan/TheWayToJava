package algorithm.twopoint;

public class LC167 {
    /**
     *  如果[1,4,5,6,7,9] target=13
     *  因为有序数组，所以1+9<13时，代表1+任何数都小于13 ,从而left++
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[]{-1, -1};
    }
}
