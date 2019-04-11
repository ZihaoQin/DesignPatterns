package ChainOfResponsibilityPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/3 16:07
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++) {
            arrayList.add(new Women(random.nextInt(4), "我要去逛街"));
        }

        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            }else if(women.getType() ==2){ //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(women);
            }else if(women.getType() == 3){ //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------");
                son.HandleMessage(women);
            }else{
                //暂时啥也不做
            }
        }
    }
}
