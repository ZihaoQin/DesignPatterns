package AbstractFactoryPattern.humanFactory;

import AbstractFactoryPattern.Enum.HumanEnum;
import AbstractFactoryPattern.human.Human;

/**
 * @ClassName:FemaleHumanFactory.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 20:58
 * @Version 1.0
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    //创建一个女性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
    //创建一个女性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }
    //创建一个女性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
