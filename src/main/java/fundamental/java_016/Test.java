package fundamental.java_016;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Throwable {
//        UserService userService = new UserServiceImpl();
//        ServiceInvocationHandler handler = new ServiceInvocationHandler(userService);
//        UserService proxy = (UserService) handler.getProxy();
//        proxy.addUser();
        System.out.println(find(new int[]{1,23,4,5,6,6,-2,3,4,5,6}));
    }

    public static int find(int[] a) {
        int odd=0;
        for(int num:a){
            odd ^= num;
        }
        return odd;
    }

}
