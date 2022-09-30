package fundamental.designMode.bridgeMode;

import fundamental.designMode.bridgeMode.channel.Pay;
import fundamental.designMode.bridgeMode.channel.WxPay;
import fundamental.designMode.bridgeMode.channel.ZfPay;
import fundamental.designMode.bridgeMode.mode.PayCypher;
import fundamental.designMode.bridgeMode.mode.PayFaceMode;
import fundamental.designMode.bridgeMode.mode.PayFingerprintMode;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println("模拟测试场景：微信支付，人脸");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_12321312","120012321031",new BigDecimal(200));
        System.out.println("模拟测试场景：支付宝支付，指纹");
        Pay zfPay = new ZfPay(new PayFingerprintMode());
        zfPay.transfer("zf_12321312","120012321asd031",new BigDecimal(200));
    }
}
