package StrategyPattern;

/**
 * @ClassName:ZhaoYun.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 12:14
 * @Version 1.0
 */
public class ZhaoYun {
    //赵云使用锦囊
    public static void main(String[] args) {
        Context context;
        //调用妙计1
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new BackDoor());
        context.operate();

        //调用妙计2
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GivenGreenLight());
        context.operate();

        //调用妙计3
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个 -------------");
        context = new Context(new BlockEnemy());
        context.operate();

    }
}
