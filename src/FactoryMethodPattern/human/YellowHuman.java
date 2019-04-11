package FactoryMethodPattern.human;

import FactoryMethodPattern.human.Human;

/**
 * @ClassName:YellowHuman.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 21:11
 * @Version 1.0
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话");
    }
}
