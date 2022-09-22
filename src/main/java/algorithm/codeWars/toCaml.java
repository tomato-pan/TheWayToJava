package algorithm.codeWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class toCaml {

    public static String toCaml(String s) {
        StringBuilder sb = new StringBuilder();
        int flag = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_' || s.charAt(i) == '-' && i + 1 < s.length()) {
                flag = i + 1;
                continue;
            }
            if (i == flag) {
                String upper = String.valueOf(s.charAt(i));
                sb.append(upper.toUpperCase());
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static List<Object> filterList(List<Object> list) {
        List res = new ArrayList();
        for (Object o : list) {
            if (o instanceof String) {
                continue;
            }
            res.add(o);
        }
        return res;
//        return list.stream().filter(s->!(s instanceof String)).collect(Collectors.toList());
    }

    public static String removeVowels(String s) {
        return s.replaceAll("[aeiouAEIOU]", "");
    }

    public static List Anagrams(String word, String[] words) {
        List res = new ArrayList();
        Map<Character, Integer> map = genrateMap(word);
        for (String w : words) {
            Map<Character, Integer> map1 = genrateMap(w);
            if (map1.equals(map)) {
                res.add(w);
            }
        }
        return res;
    }

    private static Map genrateMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!map.containsKey(word.charAt(i)) ) {
                map.put(word.charAt(i), 1);
            } else {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
//        System.out.println(toCaml("asd_asdajv_s"));
//        ArrayList a1 = new ArrayList();
//        a1.add(1);
//        a1.add("123a");
//        a1.add(124);
//        a1.add("va");
//        a1.add("123");
//        System.out.println(filterList(a1).toString());
//        String s = "this is website!";
//        System.out.println(removeVowels(s));
        System.out.println(Anagrams("abba",new String[] {"aabb","abcd","bbaa","dada"}));
    }
}
