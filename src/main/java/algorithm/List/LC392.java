package algorithm.List;

public class LC392 {
    public static boolean isSubsequence(String s, String t) {
        boolean res=false;
        int i = 0, j=0;
        while (i<s.length() && j<t.length()){
            if (s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if (i==s.length()){
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc",  "ahbgdc"));
        System.out.println(isSubsequence("axc",  "ahbgdc"));
    }
}
