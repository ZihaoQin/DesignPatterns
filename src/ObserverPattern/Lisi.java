package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName:Lisi.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/2 16:06
 * @Version 1.0
 */
public class Lisi implements Observer {


    private void reportToQiShiHuang(String context) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + context);
    }

    @Override
    public void update(Observable observable, Object object) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQiShiHuang(object.toString());
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }
}


