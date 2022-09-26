package fundamental.designMode.BuliderMode.ceilling;

import fundamental.designMode.BuliderMode.Matter;

import java.math.BigDecimal;

public class LevelOneCeiling implements Matter {

    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "自带品牌";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "一级顶";
    }
}
