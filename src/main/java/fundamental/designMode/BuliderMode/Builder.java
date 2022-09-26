package fundamental.designMode.BuliderMode;

import fundamental.designMode.BuliderMode.ceilling.LevelOneCeiling;
import fundamental.designMode.BuliderMode.ceilling.LevelTwoCeiling;
import fundamental.designMode.BuliderMode.coat.DuluxCoat;
import fundamental.designMode.BuliderMode.coat.LiBangCoat;
import fundamental.designMode.BuliderMode.floor.ShengXiangFloor;
import fundamental.designMode.BuliderMode.tile.DongPengTile;
import fundamental.designMode.BuliderMode.tile.MarcoPoloTile;

public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling()) //
                .appendCoat(new DuluxCoat()) //
                .appendFloor(new ShengXiangFloor()); //
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "田园")
                .appendCeiling(new LevelTwoCeiling()) //
                .appendCoat(new LiBangCoat()) //
                .appendTile(new MarcoPoloTile()); //
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling()) //
                .appendCoat(new LiBangCoat()) //
                .appendTile(new DongPengTile());
    }
}
