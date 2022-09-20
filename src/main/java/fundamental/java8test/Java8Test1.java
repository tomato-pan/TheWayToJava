package fundamental.java8test;

import java.util.Arrays;
import java.util.List;

public class Java8Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{2,5,9,7,3});
        int factor = 1;
        list.forEach(element -> { System.out.println(element*factor);}); // lambda表达式只能引用final或final局部变量--不能修改域外的变量


    }
}
