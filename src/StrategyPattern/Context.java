package StrategyPattern;

/**
 * @ClassName:Context.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 12:12
 * @Version 1.0
 */
public class Context {
    //构造函数，你要使用哪个妙计
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋
    public void operate(){
        this.strategy.operate();
    }
}
