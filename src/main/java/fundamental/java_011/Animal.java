package fundamental.java_011;

public class Animal implements interfaceDemo{

    public void eat() {
        System.out.println("Animal eating！");
    }

    public void play() {
        System.out.println("Animal playing！");
    }

    public static void main(String[] args) {
        Animal an = new Animal();
        // an.name = "123345"; 无法修改接口内部变量
        // an.name1 = "123345";
        System.out.println(an.name);
        System.out.println(an.name1);
        an.eat();
        an.play();
    }
}
