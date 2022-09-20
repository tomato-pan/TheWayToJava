package fundamental.designMode.javaFactoryDemo.impl;

import fundamental.designMode.javaFactoryDemo.ICommodity;
import fundamental.designMode.javaFactoryDemo.service.CardService;
import fundamental.designMode.javaFactoryDemo.vo.CardResult;

import java.util.HashMap;
import java.util.Map;

public class CardCommodityService implements ICommodity {
    private CardService cardService = new CardService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CardResult cardResult = cardService.send(uId,commodityId,bizId,getExtMap());
        System.out.println("请求参数[优惠券]");
        System.out.println(" uId："+uId);
        System.out.println(" commodityId："+commodityId);
        System.out.println(" bizId："+bizId);
        System.out.println(" extMap："+extMap);
        System.out.println("测试结果[优惠券]："+ cardResult.getResult());
    }

    public Map getExtMap(){
        Map<String,String> res = new HashMap<>();
        res.put("address","China");
        res.put("phone","123123");
        res.put("cardId","123123123");
        return res;
    }
}
