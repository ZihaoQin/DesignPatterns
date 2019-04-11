package FactoryMethodPattern;

import FactoryMethodPattern.factory.HumanFactory;
import FactoryMethodPattern.human.*;

/**
 * @ClassName:NvWa.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 21:22
 * @Version 1.0
 */
public class NvWa {
    public static void main(String[] args) {
        System.out.println("------------造出的第一批人是这样的：白人 -----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();
        System.out.println("------------造出的第一批人是这样的：黑人 -----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();
        blackHuman.cry();
        blackHuman.talk();
        System.out.println("------------造出的第一批人是这样的：黄人 -----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();
        yellowHuman.cry();
        yellowHuman.talk();


        System.out.println("============================================");
        for (int i=0;i<1000;i++){
            System.out.println("-----随机产生了人种----"+i);
            Human human = HumanFactory.createHuman();
            human.laugh();
            human.cry();
            human.talk();
        }
    }
}
