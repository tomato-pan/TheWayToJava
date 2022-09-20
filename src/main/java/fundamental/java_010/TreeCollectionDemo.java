package fundamental.java_010;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeCollectionDemo {
    private Integer age;

    public TreeCollectionDemo(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }


    public static void main(String[] args) {
        TreeMap<TreeCollectionDemo, String> treeMap = new TreeMap<>(new Comparator<TreeCollectionDemo>() {
            @Override
            public int compare(TreeCollectionDemo person1, TreeCollectionDemo person2) {
                int num = person1.getAge() - person2.getAge();
                return Integer.compare(num, 0);
            }
        });
        treeMap.put(new TreeCollectionDemo(3), "person1");
        treeMap.put(new TreeCollectionDemo(18), "person2");
        treeMap.put(new TreeCollectionDemo(35), "person3");
        treeMap.put(new TreeCollectionDemo(16), "person4");
        treeMap.entrySet().stream().forEach(personStringEntry -> {
            System.out.println(personStringEntry.getValue());
        });
    }


}
