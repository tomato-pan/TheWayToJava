package fundamental.java_010;

public class AbstractDemo {
    public static void main(String[] args) {
        //抽象类无法实例化 Employee e = new Employee("George W.", "Houston, TX", 43,40000);
        System.out.println();
        //e.mailCheck();
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
