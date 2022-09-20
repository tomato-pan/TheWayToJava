package fundamental.designMode.javaFactoryDemo.service;

import fundamental.designMode.javaFactoryDemo.vo.CouponResult;

public class CouponService {
    public CouponResult send(String uId, String commodityId, String bizId){
        CouponResult couponResult = new CouponResult();
        System.out.println("发送成功！");
        couponResult.setResult("Success");
        couponResult.setCode(100);
        return couponResult;
    }
}
