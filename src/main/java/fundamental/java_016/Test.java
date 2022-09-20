package fundamental.java_016;

public class Test {
    public static void main(String[] args) throws Throwable {
        UserService userService = new UserServiceImpl();
        ServiceInvocationHandler handler = new ServiceInvocationHandler(userService);
        UserService proxy = (UserService) handler.getProxy();
        proxy.addUser();
    }
}
