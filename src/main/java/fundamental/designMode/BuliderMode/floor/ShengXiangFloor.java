package fundamental.designMode.BuliderMode.floor;

import fundamental.designMode.BuliderMode.Matter;

import java.math.BigDecimal;

public class ShengXiangFloor implements Matter {
    public String scene() {
        return "地板";
    }
    public String brand() {
        return "圣象";
    }
    public String model() {
        return "一级";
    }
    public BigDecimal price() {
        return new BigDecimal(318);
    }
    public String desc() {
        return "圣象11111";
    }
}
