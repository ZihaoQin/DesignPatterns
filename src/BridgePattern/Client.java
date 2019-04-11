package BridgePattern;

import BridgePattern.corp.*;
import BridgePattern.prod.Clothes;
import BridgePattern.prod.House;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/29 13:18
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        House house = new House();
        System.out.println("-------房地产公司是这个样子运行的-------");
        Corp houseCorp = new HouseCorp(house);
        houseCorp.makeMonkey();


        System.out.println("-------山寨公司是这样运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        shanZhaiCorp.makeMonkey();
    }
}
