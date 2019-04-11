package StrategyPattern;

/**
 * @ClassName:BlockEnemy.java
 * @Description:TODO （第三个妙计）
 * @Author:qzh
 * @Date: 2019/3/26 12:05
 * @Version 1.0
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
