package algorithm.List;

import java.util.Arrays;

public class LC238 {

    public static int[] productExceptSelf(int[] nums) {//请不要使用除法
        int[] res = new int[nums.length];
        int muti = 1;
        int flag = 0; //标记0的个数
        // 计算所有数的积
        for (int num : nums) {
            if (num == 0) {
                flag ++;
                continue;
            }
            muti *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (flag==1) {
                if (nums[i] != 0){
                    res[i]=0;
                }else {
                    res[i]=muti;
                }
            } else if (flag==0) {
                res[i] = muti / nums[i];
            }else if (flag>1){
                res[i]=0;
            }
        }
        return res;
    }

    public static int[] productExceptSelf2(int[] nums) {//请不要使用除法
//        int[] res = new int[nums.length];

        //暴力方式
//        for (int i = 0; i < nums.length; i++) {
//            muti=1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i!=j){
//                    muti*=nums[j];
//                }
//            }
//            res[i] = muti;
//        }
//        return res;
        //左右相乘
        int length = nums.length;

        // L 和 R 分别表示左右两侧的乘积列表
        int[] L = new int[length];
        int[] R = new int[length];

        int[] ans = new int[length];

        // L[i] 为索引 i 左侧所有元素的乘积
        // 对于索引为 '0' 的元素，因为左侧没有元素，所以 L[0] = 1
        L[0] = 1;
        for (int i = 1; i < length; ++i) {
            L[i] = L[i - 1] * nums[i - 1];
        }

        // R[i] 为索引 i 右侧所有元素的乘积
        // 对于索引为 'length-1' 的元素，因为右侧没有元素，所以 R[length-1] = 1
        R[length - 1] = 1;
        for (int i = length - 2; i >= 0; --i) {
            R[i] = R[i + 1] * nums[i + 1];
        }

        // 对于索引 i，除 nums[i] 之外其余各元素的乘积就是左侧所有元素的乘积乘以右侧所有元素的乘积
        for (int i = 0; i < length; ++i) {
            ans[i] = L[i] * R[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 3, 2, 4})));
        System.out.println(Arrays.toString(productExceptSelf2(new int[]{1, 3, 2, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
        System.out.println(Arrays.toString(productExceptSelf2(new int[]{-1, 1, 0, -3, 3})));
    }
}
