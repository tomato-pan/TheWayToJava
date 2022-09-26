package fundamental.designMode.BuliderMode.tile;

import fundamental.designMode.BuliderMode.Matter;

import java.math.BigDecimal;

public class DongPengTile implements Matter {
    public String scene() {
        return "地砖";
    }
    public String brand() {
        return "东鹏";
    }
    public String model() {
        return "10001";
    }
    public BigDecimal price() {
        return new BigDecimal(102);
    }
    public String desc() {
        return "东鹏132.35";
    }
}
