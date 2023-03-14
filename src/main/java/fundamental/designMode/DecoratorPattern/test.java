package fundamental.designMode.DecoratorPattern;

public class test {
    public static void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }
    public static void test_LoginSsoDecorator1() {
        LoginSsoDecorator1 ssoDecorator = new LoginSsoDecorator1(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }
    public static void main(String[] args) {
        test_LoginSsoDecorator(); //一堆代码实现方式
        test_LoginSsoDecorator1(); //新的实现方式
    }
}
