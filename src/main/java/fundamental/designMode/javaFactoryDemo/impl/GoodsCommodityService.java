package fundamental.designMode.javaFactoryDemo.impl;

import fundamental.designMode.javaFactoryDemo.ICommodity;
import fundamental.designMode.javaFactoryDemo.service.GoodsService;
import fundamental.designMode.javaFactoryDemo.vo.GoodsResult;

import java.util.HashMap;
import java.util.Map;

public class GoodsCommodityService implements ICommodity {
    private GoodsService goodsService = new GoodsService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        GoodsResult goodsResult = goodsService.send(uId,commodityId,bizId,getExtMap());
        System.out.println("请求参数[优惠券]");
        System.out.println(" uId："+uId);
        System.out.println(" commodityId："+commodityId);
        System.out.println(" bizId："+bizId);
        System.out.println(" extMap："+extMap);
        System.out.println("测试结果[优惠券]："+ goodsResult.getResult());
    }

    public Map getExtMap(){
        Map<String,String> res = new HashMap<>();
        res.put("address","China");
        res.put("phone","123123");
        return res;
    }
}
