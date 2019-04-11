package BridgePattern.prod;

/**
 * @ClassName:House.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/29 20:05
 * @Version 1.0
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
