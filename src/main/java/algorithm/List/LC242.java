package algorithm.List;

public class LC242 {
    public static boolean isAnagram(String s, String t) {
        char [] maps = new char[26];
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            maps[cs-'a']+=1;
        }
        for (int i = 0; i < t.length(); i++) {
            char tc = t.charAt(i);
            maps[tc-'a']-=1;
        }
        for (int i = 0; i < 26 ; i++) {
            if (maps[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat",  "car"));
    }
}
