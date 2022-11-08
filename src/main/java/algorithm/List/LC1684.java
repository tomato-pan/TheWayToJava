package algorithm.List;

public class LC1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            int flag = 1;
            for (int i = 0; i < word.length(); i++) {
                if (!allowed.contains(String.valueOf(word.charAt(i)))) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count++;
            }
        }
        return count;
    }

    public static int countConsistentStrings1(String allowed, String[] words) {
        int count = 0;
        int[] alpha = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            alpha[allowed.charAt(i) - 'a'] += 1;
        }
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (alpha[word.charAt(i) - 'a'] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int count = countConsistentStrings1("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"});
        System.out.println(count);
    }
}
