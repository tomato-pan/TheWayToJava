package fundamental.jave_017;

public class valueTransport {

     class Person {
        private String name;

         public Person(String s) {
             this.name = s;
         }
         // 省略构造函数、Getter&Setter方法

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }
     }

    public void aaa(){
        Person xiaoZhang = new Person("小张");
        Person xiaoLi = new Person("小李");
        swap(xiaoZhang, xiaoLi);
        System.out.println("xiaoZhang:" + xiaoZhang.getName());
        System.out.println("xiaoLi:" + xiaoLi.getName());
    }

    public static void main(String[] args) {
        valueTransport valueTransport = new valueTransport();
        valueTransport.aaa();
    }
    public static void swap(Person person1, Person person2) {
        Person temp = person1;
        person1 = person2;
        person2 = temp;
        System.out.println("person1:" + person1.getName());
        System.out.println("person2:" + person2.getName());
    }

}
