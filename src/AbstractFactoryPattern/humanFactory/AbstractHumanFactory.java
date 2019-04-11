package AbstractFactoryPattern.humanFactory;


import AbstractFactoryPattern.Enum.HumanEnum;
import AbstractFactoryPattern.human.Human;

/**
 * @ClassName:AbstractHumanFactory.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 19:55
 * @Version 1.0
 */
public abstract class AbstractHumanFactory implements HumanFactory {
    protected Human createHuman(HumanEnum humanEnum){
        Human human = null;
        if (!humanEnum.getValue().equals("")){
            try {
                //直接产生一个实例
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return human;

    }

}
