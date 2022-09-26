package fundamental.designMode.BuliderMode.ceilling;

import fundamental.designMode.AbstartFactory.factory.Mac;
import fundamental.designMode.BuliderMode.Matter;

import java.math.BigDecimal;

public class LevelTwoCeiling implements Matter {
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
        return "2级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(960);
    }

    @Override
    public String desc() {
        return "2级顶";
    }
}
