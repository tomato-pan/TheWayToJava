package fundamental.designMode.bridgeMode.mode;

public class PayFaceMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("人脸识别开始....");
        System.out.println("人脸识别结束....");
        return true;
    }
}
