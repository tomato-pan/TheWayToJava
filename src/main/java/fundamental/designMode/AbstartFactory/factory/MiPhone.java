package fundamental.designMode.AbstartFactory.factory;

public class MiPhone implements Phone{
    public MiPhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制造小米手机！");
    }
}
