package algorithm.List;

import java.util.ArrayList;
import java.util.List;

public class LC57 {
    /*
    输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
    输出：[[1,5],[6,9]]
    示例 2：

    输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
    输出：[[1,2],[3,10],[12,16]]
    解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
    示例 3：

    输入：intervals = [], newInterval = [5,7]
    输出：[[5,7]]
    示例 4：

    输入：intervals = [[1,5]], newInterval = [2,3]
    输出：[[1,5]]
    示例 5：

    输入：intervals = [[1,5]], newInterval = [2,7]
    输出：[[1,7]]
     */
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int st = newInterval[0], ed = newInterval[1];
        boolean insert = false;
        for (int[] interval : intervals) {
            int s = interval[0], e = interval[1];
            if (ed < s) {
                if (!insert) {
                    ans.add(new int[] {st, ed});
                    insert = true;
                }
                ans.add(interval);
            } else if (e < st) {
                ans.add(interval);
            } else {
                st = Math.min(st, s);
                ed = Math.max(ed, e);
            }
        }
        if (!insert) {
            ans.add(new int[] {st, ed});
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
