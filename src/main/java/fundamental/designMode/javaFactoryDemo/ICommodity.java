package fundamental.designMode.javaFactoryDemo;

import java.util.Map;

public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String,String> extMap)throws Exception;
}
