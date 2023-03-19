package fundamental.designMode.AdapterMode.impl;

import fundamental.designMode.AdapterMode.OrderAdapterService;
import fundamental.designMode.AdapterMode.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();
    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
