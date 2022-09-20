package fundamental.designMode.proxyMode;

public class ChanelFactory implements SellPerfume{
    @Override
    public void sellPerfume(double price) {
        System.out.println("成功购买chanel 价格： "+price+ "元");
    }
}
