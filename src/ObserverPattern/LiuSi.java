package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName:LiuSi.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/3 13:00
 * @Version 1.0
 */
public class LiuSi implements Observer {
    //一看韩非子有变化，他就快乐
    private void happy(String context){
        System.out.println("刘斯：因为" +context+",——所以我快乐呀！" );
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了...");
        this.happy(arg.toString());
        System.out.println("刘斯：真被乐死了\n");
    }
}
