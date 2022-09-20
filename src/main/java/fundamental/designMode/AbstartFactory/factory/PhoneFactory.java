package fundamental.designMode.AbstartFactory.factory;

public class PhoneFactory {
    public Phone makePhone(String phoneType){
        if (phoneType.equalsIgnoreCase("MiPhone")){
            return new MiPhone();
        }
        else if (phoneType.equalsIgnoreCase("IPhone"))
        {
            return new IPhone();
        }
        return null;
    }
}
