package BuilderPattern.builder;

import BuilderPattern.model.CarModel;

import java.util.ArrayList;

/**
 * @ClassName:CarBuilder.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 18:39
 * @Version 1.0
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();


}
