package FactoryMethodPattern.human;

import FactoryMethodPattern.human.Human;

/**
 * @ClassName:WhiteHuman.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 21:12
 * @Version 1.0
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人会说");
    }
}
