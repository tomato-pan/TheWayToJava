package fundamental.designMode.AbstartFactory.factory;

public class AppleFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePC() {
        return new Mac();
    }
}
