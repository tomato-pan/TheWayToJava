package fundamental.designMode.BuliderMode.tile;

import fundamental.designMode.BuliderMode.Matter;

import java.math.BigDecimal;

public class MarcoPoloTile  implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "123";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(130);
    }

    @Override
    public String desc() {
        return "马可波罗2133";
    }
}
