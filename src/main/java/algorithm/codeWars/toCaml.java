package algorithm.codeWars;

import java.util.ArrayList;
import java.util.List;

public class toCaml {

    public static  String toCaml(String s){
        StringBuilder sb = new StringBuilder();
        int flag = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='_' || s.charAt(i)=='-' && i+1<s.length()){
                flag=i+1;
                continue;
            }
            if (i == flag){
                String upper = String.valueOf(s.charAt(i));
                sb.append(upper.toUpperCase()) ;
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static List<Object> filterList(List<Object> list){
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
    public static String removeVowels(String s){
        return s.replaceAll("[aeiouAEIOU]","");
    }


    public static void main(String[] args) {
        System.out.println(toCaml("asd_asdajv_s"));
        ArrayList a1 = new ArrayList();
        a1.add(1);
        a1.add("123a");
        a1.add(124);
        a1.add("va");
        a1.add("123");
        System.out.println(filterList(a1).toString());
        String s = "this is website!";
        System.out.println(removeVowels(s));
    }
}
