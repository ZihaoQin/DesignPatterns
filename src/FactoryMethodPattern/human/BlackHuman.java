package FactoryMethodPattern.human;

import FactoryMethodPattern.human.Human;

/**
 * @ClassName:BlackHuman.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 21:14
 * @Version 1.0
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑种人会说话");
    }
}
