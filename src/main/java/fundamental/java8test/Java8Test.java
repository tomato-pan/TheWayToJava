package fundamental.java8test;

import java.util.*;

public class Java8Test {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("google");
        names1.add("google");
        names1.add("runoob");
        names1.add("baidu");
        names1.add("baidu");
        names1.add("alibaba");
        List<String> names2 = new ArrayList<String>();
        names2.add("google");
        names2.add("runoob");
        names2.add("baidu");
        names2.add("alibaba");
        System.out.println("使用java7方法：");
        Java8Test tester = new Java8Test();
        tester.sortUsing7(names1);
        System.out.println(names1);
        System.out.println("使用java8方法：");
        tester.sortUsing8(names2);
        System.out.println(names2);
    }
    private void sortUsing7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
    private void sortUsing8(List<String> names){
        Collections.sort(names,(s1,s2) -> s1.compareTo(s2));
    }
}
