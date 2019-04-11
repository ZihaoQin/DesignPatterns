package BridgePattern.prod;

/**
 * @ClassName:House.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/29 20:05
 * @Version 1.0
 */
public class IPord extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
