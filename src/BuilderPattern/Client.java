package BuilderPattern;

import BuilderPattern.builder.BMWBuilder;
import BuilderPattern.builder.BenzBuilder;
import BuilderPattern.director.Director;
import BuilderPattern.model.BMWModel;
import BuilderPattern.model.BenzModel;
import BuilderPattern.model.CarModel;

import java.util.ArrayList;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 16:59
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getABenzModel().run();
        director.getBBenzModel().run();
        director.getCBMWModel().run();
        director.getDBMWModel().run();
    }
}
