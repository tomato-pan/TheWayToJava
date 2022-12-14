package fundamental.designMode.BuliderMode.coat;

import fundamental.designMode.BuliderMode.Matter;

import java.math.BigDecimal;

public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(333);
    }

    @Override
    public String desc() {
        return "多乐士111";
    }
}
