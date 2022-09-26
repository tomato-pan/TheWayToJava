package fundamental.designMode.BuliderMode.coat;

import fundamental.designMode.BuliderMode.Matter;

import java.math.BigDecimal;

public class LiBangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(666);
    }

    @Override
    public String desc() {
        return "立邦111";
    }
}
