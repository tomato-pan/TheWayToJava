package algorithm.string;

public class LC443 {
    public static int compress(char[] chars) {
        int n = chars.length;
        int i = 0, j = 0;
        while (i < n) {
            int idx = i;
            while (idx < n && chars[idx] == chars[i]) idx++;
            int cnt = idx - i;
            chars[j++] = chars[i];
            if (cnt > 1) {
                int start = j, end = start;
                while (cnt != 0) {
                    chars[end++] = (char)((cnt % 10) + '0');
                    cnt /= 10;
                }
                reverse(chars, start, end - 1);
                j = end;
            }
            i = idx;
        }
        return j;
    }
    static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char t = chars[start];
            chars[start] = chars[end];
            chars[end] = t;
            start++; end--;
        }
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(compress(new char[]{'a'}));
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}
