package BuilderPattern.builder;

import BuilderPattern.model.BMWModel;
import BuilderPattern.model.CarModel;

import java.util.ArrayList;

/**
 * @ClassName:BMWBuilder.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 19:48
 * @Version 1.0
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
