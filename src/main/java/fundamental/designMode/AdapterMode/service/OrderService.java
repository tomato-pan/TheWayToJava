package fundamental.designMode.AdapterMode.service;

public class OrderService {
    public long queryUserOrderCount(String userId) {
        System.out.println("自营商家，查询用户的订单是否为首单：" + userId);
        return 10L;
    }
}
