package algorithm.List;

import java.util.Arrays;

public class LC1688 {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String tmp = word;
        while (sequence.contains(word)) {
            word += tmp;
            count++;
        }
        return count;
    }

    public int maxRepeating1(String sequence, String word) {
        int n = sequence.length(), m = word.length(), ans = 0;
        int[] f = new int[n + 10];
        for (int i = 1; i <= n; i++) {
            if (i - m < 0) continue;
            if (sequence.substring(i - m, i).equals(word)) f[i] = f[i - m] + 1;
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }

}
