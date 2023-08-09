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

    public static void main(String[] args) {
        int i = missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(i);
        System.out.println(subtractProductAndSum(1));
    }
}
