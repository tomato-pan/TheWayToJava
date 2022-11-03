package algorithm.DP;

import com.sun.deploy.security.ValidationState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getCoins {
    public static int solution(int[] coins, Integer target) {
        int[] f = new int[target + 1];
        int res;
        // f[i] = min(f[i-coin]+1,f[i])
        for (int i = 0; i < target; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                f[i] = Math.min(f[i - coin] + 1, f[i]);
            }
        }
        System.out.println(f);
        return 1;
    }

    public static int getSums(int[] list, int k) {
        int[] fn = new int[k + 1];
        fn[0] = 0;
        int start = 0;
        int n = list.length;
        for (int i = 1; i <= k; i++) {
            fn[i] = Math.max(list[start] + fn[i - 1], list[n - i] + fn[i - 1]);
            if (list[0] > list[n - 1]) {
                start += 1;
            } else {
                n = n - 1;
            }
        }
        return fn[k];
    }


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        Map<String ,Integer> ruleMap = new HashMap();
        ruleMap.put("type",0);
        ruleMap.put("color",1);
        ruleMap.put("name",2);
        for (List<String> item : items) {
            if (item.get(ruleMap.get(ruleKey)).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 5}, 21));
        System.out.println(getSums(new int[]{5, 4, 3, 2, 1}, 2));
    }
}
