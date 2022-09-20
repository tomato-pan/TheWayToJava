package fundamental.designMode.AbstartFactory.factory;

public class IPhone implements Phone{
    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造苹果手机！");
    }
}
