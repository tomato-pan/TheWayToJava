package fundamental.designMode.AbstartFactory.factory;

public class Mac implements PC{
    public Mac() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造IMac！");
    }
}
