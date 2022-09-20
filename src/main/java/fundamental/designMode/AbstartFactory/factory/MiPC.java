package fundamental.designMode.AbstartFactory.factory;

public class MiPC implements PC{
    public MiPC() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造小米电脑");
    }
}
