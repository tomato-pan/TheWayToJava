package algorithm.twopoint;

public class LC125 {
    public static boolean isPalindrome(String s) {
        String toLowerCase = s.toLowerCase();
        int i = 0, j = toLowerCase.length() - 1;
        while (i <= j) {
            if (!alphaNum(toLowerCase.charAt(i))) {
                i++;
                continue;
            }
            if (!alphaNum(toLowerCase.charAt(j))) {
                j--;
                continue;
            }
            char charAtI = toLowerCase.charAt(i);
            char charAtJ = toLowerCase.charAt(j);
            if (charAtI != charAtJ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean alphaNum(char charAt) {
        return (charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z') || (charAt >= '0' && charAt <= '9');
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("A man, ma"));
        System.out.println(isPalindrome(" "));
    }
}
