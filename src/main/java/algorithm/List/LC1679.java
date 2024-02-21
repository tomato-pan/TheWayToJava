package algorithm.List;

import java.util.Arrays;

public class LC1679 {
    public static int maxOperations(int[] nums, int k) {
        int cnt = 0;
        Arrays.sort(nums);
        int i=0 ,j=nums.length-1;
        while (i<j){
            if(nums[i] + nums[j] == k){
                cnt++;
                i++;
                j--;
            }else if(nums[i] + nums[j] > k){
                j--;
            }else{
                i++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4},5));
        System.out.println(maxOperations(new int[]{3,1,3,4,3},6));
        System.out.println(maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4},2));
    }
}
