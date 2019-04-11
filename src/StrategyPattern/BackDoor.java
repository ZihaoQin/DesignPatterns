package StrategyPattern;

/**
 * @ClassName:BackDoor.java
 * @Description:TODO （第一个实现类，代表一个妙计）
 * @Author:qzh
 * @Date: 2019/3/26 12:00
 * @Version 1.0
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
