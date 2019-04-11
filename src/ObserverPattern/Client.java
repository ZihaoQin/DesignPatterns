package ObserverPattern;

import java.util.Observer;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/2 16:20
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        //定义出韩非子和李斯
        HanFeiZi hanFeiZi = new HanFeiZi();
        Observer wangSi = new WangSi();
        Observer liSi = new Lisi();
        Observer liuSi = new Lisi();

        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
