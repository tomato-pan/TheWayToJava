package algorithm.slideWindows;

public class LC2315 {
    public int countAsterisks(String s) {
        boolean tmp = true;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                tmp =!tmp;
            } else if (s.charAt(i) == '*' && tmp) {
                res ++;
            }
        }
        return res;
    }
}
