package algorithm.List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1331ArrayRankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        Map map = new HashMap();
        int[]res =new int[arr.length];
        int n = arr.length;
        int [] copy = Arrays.copyOf(arr,n);
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            map.put(arr[i],i+1);
        }
        for (int i = 0; i < n; i++) {
            res[i] = (int) map.get(copy[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{40, 10, 20, 30})));
    }
}
