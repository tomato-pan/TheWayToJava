package fundamental.designMode.bridgeMode.channel;

import fundamental.designMode.bridgeMode.mode.IPayMode;

import java.math.BigDecimal;

public class WxPay extends Pay{
    public WxPay(IPayMode payMode){
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("模拟微信渠道支付划账开始, uId {"+uId+"} tradeId　{"+tradeId+ "} amount"+amount);
        boolean security = payMode.security(uId);
        if (!security){
            System.out.println("模拟微信渠道支付划账拦截, uId {"+uId+"} tradeId　{"+tradeId+ "} amount"+amount);
            return "0001";
        }
        System.out.println("模拟微信渠道支付划账成功, uId {"+uId+"} tradeId　{"+tradeId+ "} amount"+amount);
        return "0000";
    }
}
