package fundamental.designMode.javaFactoryDemo.service;

import fundamental.designMode.javaFactoryDemo.vo.GoodsResult;

import java.util.Map;

public class GoodsService {
    public GoodsResult send(String uId, String commodityId, String bizId, Map<String, String> extMap){
        GoodsResult goodsResult = new GoodsResult();
        System.out.println("发送成功！");
        goodsResult.setResult("Success");
        goodsResult.setCode(100);
        goodsResult.setExtMap(extMap);
        return goodsResult;
    }
}
