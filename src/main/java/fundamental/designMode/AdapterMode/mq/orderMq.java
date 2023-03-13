package fundamental.designMode.AdapterMode.mq;

import java.util.Date;

public class orderMq {
    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID

    @Override
    public String toString() {
        return "{" +
                "uid:'" + uid + '\'' +
                ", sku:'" + sku + '\'' +
                ", orderId:'" + orderId + '\'' +
                ", createOrderTime:" + createOrderTime.getTime() +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    private Date createOrderTime; // 下单时间
}
