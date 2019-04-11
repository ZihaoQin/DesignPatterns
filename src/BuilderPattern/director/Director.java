package BuilderPattern.director;

import BuilderPattern.builder.BMWBuilder;
import BuilderPattern.builder.BenzBuilder;
import BuilderPattern.model.BMWModel;
import BuilderPattern.model.BenzModel;

import java.util.ArrayList;

/**
 * @ClassName:Director.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/29 9:57
 * @Version 1.0
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel(){
        System.out.println("奔驰A=============");
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel(){
        System.out.println("奔驰B=============");
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getCBMWModel(){
        System.out.println("宝马C=============");
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");

        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    public BMWModel getDBMWModel(){
        System.out.println("宝马D=============");
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
