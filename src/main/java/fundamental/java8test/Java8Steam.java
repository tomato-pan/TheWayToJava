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
        List<String> strings1 = Arrays.asList("aa", "ff", "dd");
        //String 类自身已实现Compareable接口
        strings1.stream().sorted().forEach(System.out::println);// aa dd ff

        Student s1 = new Student("aa", 10);
        Student s2 = new Student("bb", 20);
        Student s3 = new Student("aa", 30);
        Student s4 = new Student("dd", 40);
        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);

        //自定义排序：先按姓名升序，姓名相同则按年龄升序
        studentList.stream().sorted(
                (o1, o2) -> {
                    if (o1.getName().equals(o2.getName())) {
                        return o1.getAge() - o2.getAge();
                    } else {
                        return o1.getName().compareTo(o2.getName());
                    }
                }
        ).forEach(ss->{
            System.out.println(ss.getName()+ss.getAge());
        });

    }

    public void filterNums(Integer num) {
        if (num > 5) System.out.println("ok!");
        else System.out.println("no!");
    }

}

class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
