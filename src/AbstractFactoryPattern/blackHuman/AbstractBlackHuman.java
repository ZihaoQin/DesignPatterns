package AbstractFactoryPattern.blackHuman;

import AbstractFactoryPattern.human.Human;

/**
 * @ClassName:AbstractBlackHuman.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 18:57
 * @Version 1.0
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }

}
