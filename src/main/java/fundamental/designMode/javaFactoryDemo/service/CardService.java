package fundamental.designMode.javaFactoryDemo.service;

import fundamental.designMode.javaFactoryDemo.vo.CardResult;

import java.util.Map;

public class CardService {
    public CardResult send(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        CardResult cardResult = new CardResult();
        System.out.println("发送成功！");
        cardResult.setResult("Success");
        cardResult.setCode(100);
        cardResult.setCardId(Long.valueOf(extMap.get("cardId")));
        return cardResult;
    }
}
