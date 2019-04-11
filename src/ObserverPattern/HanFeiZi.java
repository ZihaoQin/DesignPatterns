package ObserverPattern;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName:HanFeiZi.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/2 15:59
 * @Version 1.0
 */
public class HanFeiZi extends Observable {
    private ArrayList<Observer> observerList = new ArrayList<Observer>();



    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了。。。");
        super.setChanged();
        //通知李斯
        super.notifyObservers("韩非子在吃饭");
    }


    public void haveFun() {
        System.out.println("韩非子开始娱乐了。。。");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }


}
