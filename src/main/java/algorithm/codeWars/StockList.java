package algorithm.codeWars;

import java.util.HashMap;
import java.util.Map;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        for (String s : lstOfArt) {
            String[] str = s.split(" ");
            if (!map.containsKey(str[0])) {
                map.put(String.valueOf(str[0].charAt(0)), Integer.parseInt(str[1]));
            } else {
                map.put(String.valueOf(str[0].charAt(0)), map.get(str[0]) + Integer.parseInt(str[1]));
            }
        }
        System.out.println(map);
        int count = 0;
        for (String ss : lstOf1stLetter) {
            System.out.println(ss);
            if (map.containsKey(ss)) {
                sb.append("(").append(ss).append(" : ").append(map.get(ss)).append(")");
                count++;
            }
            if (count % 2 == 0) {
                sb.append(" - ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stockSummary(new String[]{"Acv 200", "Vcas 300"}, new String[]{"A", "B"}));
    }
}
