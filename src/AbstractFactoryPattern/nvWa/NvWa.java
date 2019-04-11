package AbstractFactoryPattern.nvWa;

import AbstractFactoryPattern.human.Human;
import AbstractFactoryPattern.humanFactory.FemaleHumanFactory;
import AbstractFactoryPattern.humanFactory.MaleHumanFactory;

/**
 * @ClassName:NvWa.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 21:01
 * @Version 1.0
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
        FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman.sex();
    }
}
