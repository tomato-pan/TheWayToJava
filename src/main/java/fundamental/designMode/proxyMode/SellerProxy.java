package fundamental.designMode.proxyMode;

public class SellerProxy implements SellPerfume{
    private SellPerfume sellPerfume;

    public SellerProxy(SellPerfume sellPerfume) {
        this.sellPerfume = sellPerfume;
    }

    @Override
    public void sellPerfume(double price) {
        doSomethingBefore();
        sellPerfume.sellPerfume(price);
        doSomethingAfter();
    }

    private void doSomethingAfter() {
        System.out.println("操作后！");
    }

    private void doSomethingBefore() {
        System.out.println("操作前！");
    }
}
