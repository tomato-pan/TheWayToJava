package fundamental.designMode.BuliderMode.floor;

import fundamental.designMode.BuliderMode.Matter;

import java.math.BigDecimal;

public class DerFloor implements Matter {
    public String scene() {
        return "地板";
    }
    public String brand() {
        return "德尔(Der)";
    }
    public String model() {
        return "A+";
    }
    public BigDecimal price() {
        return new BigDecimal(119);
    }
    public String desc() {
        return "DER123";
    }
}
