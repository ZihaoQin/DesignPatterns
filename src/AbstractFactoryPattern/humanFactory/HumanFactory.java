package AbstractFactoryPattern.humanFactory;

import AbstractFactoryPattern.human.Human;

/**
 * @ClassName:HumanFactory.java
 * @Description:TODO （抽象方法较工厂方法的优势在于更加良好的扩展性，一个工厂可以扩展出不同的子工厂）
 * @Author:qzh
 * @Date: 2019/3/27 19:31
 * @Version 1.0
 */
public interface HumanFactory {
    //制造黄色人种
    public Human createYellowHuman();
    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();
}
