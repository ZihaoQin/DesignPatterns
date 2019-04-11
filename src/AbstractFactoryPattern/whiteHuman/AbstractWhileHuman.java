package AbstractFactoryPattern.whiteHuman;

import AbstractFactoryPattern.human.Human;

/**
 * @ClassName:AbstractWhileHuman.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 18:50
 * @Version 1.0
 */
public abstract class AbstractWhileHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白色人种会笑");
    }

    @Override
    public void cry() {
        System.out.println("白色人种会哭");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话");
    }

}
