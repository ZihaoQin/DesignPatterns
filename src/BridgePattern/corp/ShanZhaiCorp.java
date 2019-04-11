package BridgePattern.corp;

import BridgePattern.prod.Product;

/**
 * @ClassName:ShanZhaiCorp.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/29 20:30
 * @Version 1.0
 */
public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMonkey() {
        super.makeMonkey();
        System.out.println("我赚钱呀...");
    }
}
