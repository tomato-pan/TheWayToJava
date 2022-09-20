package fundamental.designMode.javaFactoryDemo.impl;

import fundamental.designMode.javaFactoryDemo.vo.CouponResult;
import fundamental.designMode.javaFactoryDemo.ICommodity;
import fundamental.designMode.javaFactoryDemo.service.CouponService;

import java.util.Map;

public class CouponCommodityService implements ICommodity {
    private CouponService couponService = new CouponService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.send(uId,commodityId,bizId);
        System.out.println("请求参数[优惠券]");
        System.out.println(" uId："+uId);
        System.out.println(" commodityId："+commodityId);
        System.out.println(" bizId："+bizId);
        System.out.println(" extMap："+extMap);
        System.out.println("测试结果[优惠券]："+ couponResult.getResult());

    }
}
