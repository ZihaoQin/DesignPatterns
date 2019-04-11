package BridgePattern.corp;

import BridgePattern.prod.House;
import BridgePattern.prod.Product;

/**
 * @ClassName:HouseCorp.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/29 13:14
 * @Version 1.0
 */
public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMonkey() {
        super.makeMonkey();
        System.out.println("房地产公司赚大钱了...");
    }
}
