package algorithm.List;

public class LC283 {

    public static void moveZeroes(int[] nums) {
        int i ,j = 0;
        for(i = 0 ; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[j++] = nums[i];
            }
        }
        while(j < nums.length)
        {
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
