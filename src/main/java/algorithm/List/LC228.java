package algorithm.List;

import java.util.ArrayList;
import java.util.List;

public class LC228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> mergeNums = new ArrayList<>();
        int i = 0, j = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] + 1 == nums[j]) {
                j++;
            } else {
                i++;
            }
            
        }
        return mergeNums;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }
}
