package fundamental.designMode.BuliderMode;

public class Test {
    public static void test_Builder(){
        Builder builder = new Builder();

        System.out.println(builder.levelOne(132.52D).getDetail());

        System.out.println(builder.levelTwo(98.25D).getDetail());

        System.out.println(builder.levelThree(85.43D).getDetail());
    }

    public static void main(String[] args) {
        test_Builder();
    }
}
