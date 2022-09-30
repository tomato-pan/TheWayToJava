package fundamental.designMode.bridgeMode.mode;

public class PayFingerprintMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("指纹识别开始....");
        System.out.println("指纹识别结束....");
        return true;
    }
}
