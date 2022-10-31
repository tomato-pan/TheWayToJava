package algorithm.DP;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static int solution1(int[] list, Integer K) {
        int start = 0;
        int [] fn = new int[K+1];
        fn[0]= 0;
        int n = list.length;
        for (int i = 1; i <= K; i++) {
            fn[i]=Math.max(fn[i-1]+list[start], fn[i-1]+list[n - 1]);
            if (list[0] > list[n - 1]) {
                start += 1;
            } else {
                n=n-1;
            }
        }
        // 队列输出数
        return fn[K];
    }

    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1, 2, 5}, 21));

        System.out.println(solution1(new int[]{5, 4, 1, 2, 6}, 2));
    }
}
