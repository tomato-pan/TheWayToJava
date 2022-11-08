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
        int[] alpha = new int[27];
        for (int i = 0; i < allowed.length(); i++) {
            alpha[allowed.charAt(i) - 'a'] += 1;

        }
        for (String word : words) {
            int flag = 1;
            for (int i = 0; i < word.length(); i++) {
                if (alpha[word.charAt(i) - 'a'] == 0) {
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
}
