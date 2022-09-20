package fundamental.java_008;

// LC686
public class Solution {
    public int repeatedStringMatch(String a, String b) {
        int l = (b.length() + a.length() - 1) / a.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            sb.append(a);
        }
        for (int i = 0; i <= sb.length() - b.length(); i++) {
            if (sb.substring(i, i + b.length()).equals(b))
                return l;
        }
        sb.append(a);
        for (int i = a.length() * l - b.length() + 1; i <= sb.length() - b.length(); i++)
            if (sb.substring(i, i + b.length()).equals(b))
                return l + 1;
        return -1;
    }
}
