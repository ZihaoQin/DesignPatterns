package StrategyPattern;

/**
 * @ClassName:GivenGreenLight.java
 * @Description:TODO （第二个妙计）
 * @Author:qzh
 * @Date: 2019/3/26 12:03
 * @Version 1.0
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国开个绿灯，放行！");
    }
}
