package fundamental.mutiStatus;

public class Test1 {
    public static void main(String[] args) {
        method(new Circle());
        method(new Triangle());
        method(new Square());
        method(new Shape());
    }

    static void method(Shape shape) {
        shape.draw();
    }
}

class Shape {
    public void draw() {};
    public void erase() {}
}

class Circle extends Shape {
    public void draw() {
        System.out.println("draw circle");
    }
    public void erase() {
        System.out.println("erase circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("draw square");
    }
    public void erase() {
        System.out.println("erase square");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("draw triangle");
    }
    public void erase() {
        System.out.println("erase triangle");
    }
}