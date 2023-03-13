package fundamental.designMode.AdapterMode.impl;

import fundamental.designMode.AdapterMode.OrderAdapterService;
import fundamental.designMode.AdapterMode.service.OrderService;

public class InsiderOrderService implements OrderAdapterService {
    private OrderService oRderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return oRderService.queryUserOrderCount(uId) <= 1;
    }
}
