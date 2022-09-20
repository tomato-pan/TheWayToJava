package fundamental.java8test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Steam {
    public static void main(String[] args) {
        Java8Steam jb = new Java8Steam();
        List<Integer> list = Arrays.asList(1, 23, 4, 5, 6, 7, 78);
        list.forEach(num -> {
            jb.filterNums(num);
        });
        List<Integer> filtered = list.stream().filter(num -> num > 6).collect(Collectors.toList());
        System.out.println(filtered);
        List<String> strings = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello", " HelloWorld", " Hollis");
        Stream s = strings.stream().filter(string -> string.length() <= 6).map(String::length).sorted().limit(3)
                .distinct();
        System.out.println(s);
    }

    public void filterNums(Integer num) {
        if (num > 5) System.out.println("ok!");
        else System.out.println("no!");
    }
}

