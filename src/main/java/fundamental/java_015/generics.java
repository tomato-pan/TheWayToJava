package fundamental.java_015;

public class generics {
    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(add(12.321, 12l));
        Point p = new Point<>();
        p.setVar("aaa");
        System.out.println(p.getVar());

        Info<String> i = null;        // 声明接口对象
        i = new InfoImp<String>("汤姆") ;  // 通过子类实例化对象
        System.out.println("内容：" + i.getVar()) ;
    }
}

// 泛型类
class Point<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
// 泛型接口
interface Info<T>{
    public T getVar();
}
class InfoImp<T> implements Info<T>{
    private T var ;             // 定义属性
    public InfoImp(T var){     // 通过构造方法设置属性内容
        this.setVar(var) ;
    }
    public void setVar(T var){
        this.var = var ;
    }
    public T getVar(){
        return this.var ;
    }
}
