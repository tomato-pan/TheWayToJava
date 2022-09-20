package fundamental.designMode.AbstartFactory.factory;

public class phoneClient {
    public static void main(String[] args) {
        PhoneFactory pf  = new PhoneFactory();
        Phone miPhone = pf.makePhone("MiPhone");
        IPhone iPhone = (IPhone) pf.makePhone("IPhone");
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory apple = new AppleFactory();
        miFactory.makePhone();
        miFactory.makePC();
        apple.makePhone();
        apple.makePC();
    }
}
