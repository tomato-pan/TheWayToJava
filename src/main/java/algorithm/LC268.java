package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LC268 {

    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int res =0;
        for (int num : nums) {
            res = num^res;
        }
        for (int i = 1; i < n+1; i++) {
            res = i^res;
        }
        return res;
    }

    public static int singleNumber(int[] nums) {
        // 计数表
        Map<Integer,Integer> numMap = new HashMap();
        for (int num : nums) {
            if (Objects.isNull(numMap.get(num))){
                numMap.put(num,1);
            }else {
                numMap.put(num,numMap.get(num)+1);
            }
        }
        for (Integer key : numMap.keySet()){
            if (numMap.get(key) ==1){
                return key;
            }
        }
        return 0;
        //位运算
    }

    public static int singleNumber1(int[] nums) {
        //位运算
        // 10进制转为3进制
        // 3进制转为10进制
        int[] cnt = new int[32];
        for (int x : nums) {
            for (int i = 0; i < 32; i++) {
                if (((x >> i) & 1) == 1) {
                    cnt[i]++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((cnt[i] % 3 & 1) == 1) {
                ans += (1 << i);
            }
        }
        return ans;

    }

    public static int subtractProductAndSum(int n) {
        int sum=0,muti=1;
        while (n!=0){
            int num = n%10;
            n = n/10;
            sum =sum+num;
            muti = muti*num;
        }
        return muti-sum;
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length, ans = 0;

        for (int i=0; i<n; i++){

            ans += mat[i][i] + mat[i][n-1-i];

        }
        return (n&1) == 0 ? ans : ans-mat[n/2][n/2];
    }

    public static void main(String[] args) {
//        int i = missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
//        System.out.println(i);
//        System.out.println(subtractProductAndSum(1));
//        System.out.println(diagonalSum(new int[][]{{1,2,3},
//                {4,5,6},
//                {7,8,9}}));
//        System.out.println(diagonalSum(new int[][]{{6}}));
//        System.out.println(diagonalSum(new int[][]{{1,2,3,4},
//                {4,5,6,7},
//                {7,8,9,10}}));

        System.out.println(singleNumber1(new int[]{2, 2, 3, 2}));
        System.out.println(singleNumber(new int[]{2, 2, 3, 2}));
    }
}
