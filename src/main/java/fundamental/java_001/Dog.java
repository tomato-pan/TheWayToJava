package fundamental.java_001;

public class Dog {
    private String name;
    private int size;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat(){
        System.out.println("eating!");
    }
    void run(){
        System.out.println("running");
    }
    void sleep(){
        System.out.println("sleeping");
    }

    public static void main(String[] args) {

    }
}
