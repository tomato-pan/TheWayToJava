package algorithm.List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC1654 {
    int ans = Integer.MAX_VALUE;
    Set<List<Object>> l;
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<Integer> seen = new HashSet<>();
        for (int num : forbidden){
            seen.add(num);
        }
        l = new HashSet<>();
        dfs(seen,0,a,b,x,false,0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    void dfs(Set<Integer> seen,int i,int a,int b,int x,boolean flag,int cnt){
        if (i > 10000){
            return;
        }
        if (i == x){
            ans = Math.min(ans,cnt);
            return;
        }
        if (l.contains(Arrays.asList(i,flag))){
            return;
        }
        l.add(Arrays.asList(i,flag));
        if (flag){
            if (!seen.contains(i + a)){
                dfs(seen,i + a,a,b,x,false,cnt + 1); // 前
            }
        } else {
            if (!seen.contains(i + a)){
                dfs(seen,i + a,a,b,x,false,cnt + 1); // 前
            }
            if (!seen.contains(i - b) && i - b >= 0){
                dfs(seen,i - b,a,b,x,true,cnt + 1); // 后
            }
        }
    }
}
