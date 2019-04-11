package FactoryMethodPattern.factory;

import FactoryMethodPattern.utils.ClassUtils;
import FactoryMethodPattern.human.Human;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @ClassName:HumanFactory.java
 * @Description:TODO （类似于策略模式，工厂方法模式通过反射来创建对象）
 * @Author:qzh
 * @Date: 2019/3/26 21:16
 * @Version 1.0
 */

/*工厂方法模式还有一个非常重要的应用，就是延迟始化(Lazy initialization)，什么是延迟始化呢？
一个对象初始化完毕后就不释放，等到再次用到得就不用再次初始化了，直接从内存过中拿到就可以了*/
public class HumanFactory {
    // 定义一个 MAP, 初始化过的 Human 对象都放在这里
    private static HashMap<String,Human> humans = new HashMap<String, Human>();
    public static Human createHuman(Class c){
        Human human = null;
        try {
            if (humans.containsKey(c.getSimpleName())){
                human = humans.get(c.getSimpleName());
            }else {
                //通过反射创建类
                human = (Human) Class.forName(c.getName()).newInstance();
                //放到Map中
                humans.put(c.getSimpleName(),human);
            }
        } catch (InstantiationException e) {
            System.out.println("必须指定人种颜色");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误！");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人种找不到！");
            e.printStackTrace();
        }
        return human;
    }

    public static Human createHuman(){
        Human human = null;
        List<Class> concerteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        System.out.println(concerteHumanList.size());
        int rand = random.nextInt(concerteHumanList.size());
        human = createHuman(concerteHumanList.get(rand));
        return human;
    }
}
