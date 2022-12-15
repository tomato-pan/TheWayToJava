package algorithm.slideWindows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC56 {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[][]{};
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int  n = intervals.length;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n;i++) {
            int min = intervals[i][0];
            int max = intervals[i][1];
            while (i < n && max >= intervals[i][0]) {
                max = Math.max(intervals[i][1], max);
                i++;
            }
            i--;
            list.add(new int[]{min, max});
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println((Arrays.deepToString(merge(intervals))));
    }
}
