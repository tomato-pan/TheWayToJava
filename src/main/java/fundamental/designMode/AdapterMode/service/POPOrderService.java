package fundamental.designMode.AdapterMode.service;

public class POPOrderService {


    public boolean isFirstOrder(String uId){
        System.out.println("POP商家，查询用户的订单是否为首单："+ uId);
        return true;
    }
}
