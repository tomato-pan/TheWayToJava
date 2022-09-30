package fundamental.designMode.bridgeMode.mode;

public class PayCypher implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("密码支付....");
        return true;
    }
}
