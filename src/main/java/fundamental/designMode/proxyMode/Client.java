package fundamental.designMode.proxyMode;

public class Client {
    public static void main(String[] args) {
        ChanelFactory factory = new ChanelFactory();
        SellerProxy proxy  = new SellerProxy(factory);
        proxy.sellPerfume(223);
    }
}
