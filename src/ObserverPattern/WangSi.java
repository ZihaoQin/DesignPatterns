package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName:WangSi.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/3 12:59
 * @Version 1.0
 */
public class WangSi implements Observer {

    private void cry(String context){
        System.out.println("王斯：因为"+context+"，——所以我悲伤呀！");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
        this.cry(arg.toString());
        System.out.println("王斯：真真的哭死了...\n");
    }
}
