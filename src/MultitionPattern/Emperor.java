package MultitionPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName:Emperor.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 15:36
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Emperor {
    private static int maxNumOfEmperor = 2;//最多只能有两个皇帝
    private static ArrayList emperorInfoList =  new ArrayList(maxNumOfEmperor); //皇帝叫什么名字
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);//装皇帝的列表
    private static int countNumOfEmperor = 0;//正在被人尊称的是哪个皇帝

    //先把两个皇帝生产出来
    static {
        for (int i=0;i<maxNumOfEmperor;i++){
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    public Emperor() {
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    public Emperor(String info) {
        emperorInfoList.add(info);
    }
    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }
    public static void empererInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}
