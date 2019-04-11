package AbstractFactoryPattern.humanFactory;

import AbstractFactoryPattern.Enum.HumanEnum;
import AbstractFactoryPattern.human.Human;

/**
 * @ClassName:MaleHumanFactory.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 20:55
 * @Version 1.0
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    //创建一个男性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    //创建一个男性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    //创建一个男性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);

    }
}
