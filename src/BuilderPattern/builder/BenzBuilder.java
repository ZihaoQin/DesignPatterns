package BuilderPattern.builder;

import BuilderPattern.model.BenzModel;
import BuilderPattern.model.CarModel;

import java.util.ArrayList;

/**
 * @ClassName:BenzBuilder.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 19:21
 * @Version 1.0
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();



    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
